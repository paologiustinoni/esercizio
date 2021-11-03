package it.mytest.esercizio.testcontroller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.mytest.esercizio.entities.Account;
import it.mytest.esercizio.entities.Creditor;
import it.mytest.esercizio.entities.LegalPersonBeneficiary;
import it.mytest.esercizio.entities.MoneyTransfer;
import it.mytest.esercizio.entities.NaturalPersonBeneficiary;
import it.mytest.esercizio.entities.TaxRelief;
import it.mytest.esercizio.entities.TransactionDetail;
import it.mytest.esercizio.entities.response.MoneyTransferResult;

public class AccountControllerTest extends ControllerTest {
	
	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void testBalance() throws Exception {
		mockMvc.perform(get("/account/balance")).andExpect(status().isOk())
        	.andExpect(jsonPath("$").isNotEmpty())
        	.andExpect(jsonPath("$").isNumber())
        	//.andExpect(jsonPath("$").value(364.55))
        	.andDo(MockMvcResultHandlers.print());

	}
	
	@Test
	public void testTransactionsList_ValidDate() throws Exception {
		LinkedMultiValueMap<String, String> requestParams = createParamsTransactionList("2019-01-01", "2019-12-01");
		
		mockMvc.perform(get("/account/transactions").params(requestParams)).andExpect(status().isOk());
	}
	
	@Test
	public void testTransactionsList_InvalidDate() throws Exception {
		LinkedMultiValueMap<String, String> requestParams = createParamsTransactionList("2019-12-01", "2019-01-01");
		
		mockMvc.perform(get("/account/transactions").params(requestParams)).andExpect(status().isBadRequest());
	}
	
	@Test
	public void testTransactionsList_ListSizeNotZero() throws Exception {
		LinkedMultiValueMap<String, String> requestParams = createParamsTransactionList("2019-01-01", "2019-12-01");
		
		MvcResult result = mockMvc.perform(get("/account/transactions").params(requestParams)).andReturn();
		
		ObjectMapper mapper = new ObjectMapper();
		List<TransactionDetail> transactionList = new ArrayList<>();
		
		String content = result.getResponse().getContentAsString();
		
		transactionList = Arrays.asList(mapper.readValue(content, TransactionDetail[].class));
		Assert.assertEquals(14, transactionList.size());
		Assert.assertNotEquals(0, transactionList.size());
	}
	
	@Test
	public void testMoneyTransfer_Status() throws Exception {
		LinkedMultiValueMap<String, String> requestParams = createParamsMoneyTransfer("pippo", "test", "EUR", "700", "2021-12-01");
		
		mockMvc.perform(MockMvcRequestBuilders.post("/account/moneyTransfer")
                .params(requestParams)
                .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());
	}

    private LinkedMultiValueMap<String, String> createParamsMoneyTransfer(String receiverName, String description, String currency, String amount, String executionDate) {
    	
    	LinkedMultiValueMap<String, String> requestParams = new LinkedMultiValueMap<>();
		requestParams.add("receiverName", receiverName);
		requestParams.add("description", description);
		requestParams.add("currency", currency);
		requestParams.add("amount", amount);
		requestParams.add("executionDate", executionDate);
		return requestParams;
	}

	private String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
	
	private LinkedMultiValueMap<String, String> createParamsTransactionList(String fromAccountingDate, String toAccountingDate) {
		LinkedMultiValueMap<String, String> requestParams = new LinkedMultiValueMap<>();
		requestParams.add("fromAccountingDate", fromAccountingDate);
		requestParams.add("toAccountingDate", toAccountingDate);
		return requestParams;
	}
	
	private MoneyTransfer createAndCompileMoneyTransferCorret(String receiverName, String description, String currency, String amount, String executionDate) {
		MoneyTransfer transfer = new MoneyTransfer();
       	Creditor creditor = new Creditor();
    	creditor.setName(receiverName);
    	
    	Account account = new Account();
    	account.setAccountCode("IT60X0542811101000000123456");
    	account.setBicCode("SELBIT2BXXX");
    	 	
    	creditor.setAccount(account);    	
    	transfer.setCreditor(creditor);
    	
    	transfer.setExecutionDate(executionDate);
    	transfer.setUri("REMITTANCE_INFORMATION");
    	transfer.setDescription(description);
    	transfer.setAmount(Float.parseFloat(amount));
    	transfer.setCurrency(currency);

    	transfer.setIsUrgent(false);
    	transfer.setIsInstant(false);
    	transfer.setFeeType("SHA");
    	transfer.setFeeAccountId("14537780");
		
		NaturalPersonBeneficiary naturalPersonBeneficiary = new NaturalPersonBeneficiary();
		naturalPersonBeneficiary.setFiscalCode1("GSTPLA73B22A794Y");
		
		LegalPersonBeneficiary legalPersonBeneficiary = new LegalPersonBeneficiary();
		legalPersonBeneficiary.setFiscalCode("FISCAL_CODE");
		legalPersonBeneficiary.setLegalRepresentativeFiscalCode("FISCAL_CODE");
		
		TaxRelief taxRelief = new TaxRelief();
		taxRelief.setBeneficiaryType("NATURAL_PERSON");
		taxRelief.setCreditorFiscalCode("BNCPLA96S02A794M");
		taxRelief.setIsCondoUpgrade(false);
		taxRelief.setTaxReliefId("L449");
		taxRelief.setNaturalPersonBeneficiary(naturalPersonBeneficiary);
		taxRelief.setLegalPersonBeneficiary(legalPersonBeneficiary);
		
		transfer.setTaxRelief(taxRelief);
    	
    	return transfer;
	}
}
