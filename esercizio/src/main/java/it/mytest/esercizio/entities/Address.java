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
@JsonPropertyOrder({ "address", "city", "countryCode" })
@Generated("jsonschema2pojo")
public class Address {

	@JsonProperty("address")
	private Object address;
	@JsonProperty("city")
	private Object city;
	@JsonProperty("countryCode")
	private Object countryCode;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("address")
	public Object getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(Object address) {
		this.address = address;
	}

	@JsonProperty("city")
	public Object getCity() {
		return city;
	}

	@JsonProperty("city")
	public void setCity(Object city) {
		this.city = city;
	}

	@JsonProperty("countryCode")
	public Object getCountryCode() {
		return countryCode;
	}

	@JsonProperty("countryCode")
	public void setCountryCode(Object countryCode) {
		this.countryCode = countryCode;
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
