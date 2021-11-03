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
@JsonPropertyOrder({ "fiscalCode1", "fiscalCode2", "fiscalCode3", "fiscalCode4", "fiscalCode5" })
@Generated("jsonschema2pojo")
public class NaturalPersonBeneficiary {

	@JsonProperty("fiscalCode1")
	private String fiscalCode1;
	@JsonProperty("fiscalCode2")
	private Object fiscalCode2;
	@JsonProperty("fiscalCode3")
	private Object fiscalCode3;
	@JsonProperty("fiscalCode4")
	private Object fiscalCode4;
	@JsonProperty("fiscalCode5")
	private Object fiscalCode5;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("fiscalCode1")
	public String getFiscalCode1() {
		return fiscalCode1;
	}

	@JsonProperty("fiscalCode1")
	public void setFiscalCode1(String fiscalCode1) {
		this.fiscalCode1 = fiscalCode1;
	}

	@JsonProperty("fiscalCode2")
	public Object getFiscalCode2() {
		return fiscalCode2;
	}

	@JsonProperty("fiscalCode2")
	public void setFiscalCode2(Object fiscalCode2) {
		this.fiscalCode2 = fiscalCode2;
	}

	@JsonProperty("fiscalCode3")
	public Object getFiscalCode3() {
		return fiscalCode3;
	}

	@JsonProperty("fiscalCode3")
	public void setFiscalCode3(Object fiscalCode3) {
		this.fiscalCode3 = fiscalCode3;
	}

	@JsonProperty("fiscalCode4")
	public Object getFiscalCode4() {
		return fiscalCode4;
	}

	@JsonProperty("fiscalCode4")
	public void setFiscalCode4(Object fiscalCode4) {
		this.fiscalCode4 = fiscalCode4;
	}

	@JsonProperty("fiscalCode5")
	public Object getFiscalCode5() {
		return fiscalCode5;
	}

	@JsonProperty("fiscalCode5")
	public void setFiscalCode5(Object fiscalCode5) {
		this.fiscalCode5 = fiscalCode5;
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
