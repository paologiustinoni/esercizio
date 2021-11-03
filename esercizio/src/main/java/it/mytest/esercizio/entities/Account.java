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
@JsonPropertyOrder({ "accountCode", "bicCode" })
@Generated("jsonschema2pojo")
public class Account {

	@JsonProperty("accountCode")
	private String accountCode;
	@JsonProperty("bicCode")
	private String bicCode;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("accountCode")
	public String getAccountCode() {
		return accountCode;
	}

	@JsonProperty("accountCode")
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	@JsonProperty("bicCode")
	public String getBicCode() {
		return bicCode;
	}

	@JsonProperty("bicCode")
	public void setBicCode(String bicCode) {
		this.bicCode = bicCode;
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
