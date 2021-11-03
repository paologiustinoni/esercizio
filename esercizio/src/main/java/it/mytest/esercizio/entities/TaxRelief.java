package it.mytest.esercizio.entities;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "taxReliefId", "isCondoUpgrade", "creditorFiscalCode", "beneficiaryType",
		"naturalPersonBeneficiary", "legalPersonBeneficiary" })
@Generated("jsonschema2pojo")
public class TaxRelief {

	@JsonProperty("taxReliefId")
	private String taxReliefId;
	@JsonProperty("isCondoUpgrade")
	private boolean isCondoUpgrade;
	@JsonProperty("creditorFiscalCode")
	private String creditorFiscalCode;
	@JsonProperty("beneficiaryType")
	private String beneficiaryType;
	@JsonProperty("naturalPersonBeneficiary")
	private NaturalPersonBeneficiary naturalPersonBeneficiary;
	@JsonProperty("legalPersonBeneficiary")
	private LegalPersonBeneficiary legalPersonBeneficiary;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("taxReliefId")
	public String getTaxReliefId() {
		return taxReliefId;
	}

	@JsonProperty("taxReliefId")
	public void setTaxReliefId(String taxReliefId) {
		this.taxReliefId = taxReliefId;
	}

	@JsonProperty("isCondoUpgrade")
	public boolean isIsCondoUpgrade() {
		return isCondoUpgrade;
	}

	@JsonProperty("isCondoUpgrade")
	public void setIsCondoUpgrade(boolean isCondoUpgrade) {
		this.isCondoUpgrade = isCondoUpgrade;
	}

	@JsonProperty("creditorFiscalCode")
	public String getCreditorFiscalCode() {
		return creditorFiscalCode;
	}

	@JsonProperty("creditorFiscalCode")
	public void setCreditorFiscalCode(String creditorFiscalCode) {
		this.creditorFiscalCode = creditorFiscalCode;
	}

	@JsonProperty("beneficiaryType")
	public String getBeneficiaryType() {
		return beneficiaryType;
	}

	@JsonProperty("beneficiaryType")
	public void setBeneficiaryType(String beneficiaryType) {
		this.beneficiaryType = beneficiaryType;
	}

	@JsonProperty("naturalPersonBeneficiary")
	public NaturalPersonBeneficiary getNaturalPersonBeneficiary() {
		return naturalPersonBeneficiary;
	}

	@JsonProperty("naturalPersonBeneficiary")
	public void setNaturalPersonBeneficiary(NaturalPersonBeneficiary naturalPersonBeneficiary) {
		this.naturalPersonBeneficiary = naturalPersonBeneficiary;
	}

	@JsonProperty("legalPersonBeneficiary")
	public LegalPersonBeneficiary getLegalPersonBeneficiary() {
		return legalPersonBeneficiary;
	}

	@JsonProperty("legalPersonBeneficiary")
	public void setLegalPersonBeneficiary(LegalPersonBeneficiary legalPersonBeneficiary) {
		this.legalPersonBeneficiary = legalPersonBeneficiary;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}