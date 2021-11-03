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
@JsonPropertyOrder({ "fiscalCode", "legalRepresentativeFiscalCode" })
@Generated("jsonschema2pojo")
public class LegalPersonBeneficiary {

	@JsonProperty("fiscalCode")
	private String fiscalCode;
	@JsonProperty("legalRepresentativeFiscalCode")
	private String legalRepresentativeFiscalCode;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("fiscalCode")
	public String getFiscalCode() {
		return fiscalCode;
	}

	@JsonProperty("fiscalCode")
	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}

	@JsonProperty("legalRepresentativeFiscalCode")
	public String getLegalRepresentativeFiscalCode() {
		return legalRepresentativeFiscalCode;
	}

	@JsonProperty("legalRepresentativeFiscalCode")
	public void setLegalRepresentativeFiscalCode(String legalRepresentativeFiscalCode) {
		this.legalRepresentativeFiscalCode = legalRepresentativeFiscalCode;
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
