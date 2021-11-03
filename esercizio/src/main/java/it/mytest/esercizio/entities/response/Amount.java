
package it.mytest.esercizio.entities.response;

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
@JsonPropertyOrder({
    "debtorAmount",
    "debtorCurrency",
    "creditorAmount",
    "creditorCurrency",
    "creditorCurrencyDate",
    "exchangeRate"
})
@Generated("jsonschema2pojo")
public class Amount {

    @JsonProperty("debtorAmount")
    private int debtorAmount;
    @JsonProperty("debtorCurrency")
    private String debtorCurrency;
    @JsonProperty("creditorAmount")
    private int creditorAmount;
    @JsonProperty("creditorCurrency")
    private String creditorCurrency;
    @JsonProperty("creditorCurrencyDate")
    private String creditorCurrencyDate;
    @JsonProperty("exchangeRate")
    private int exchangeRate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("debtorAmount")
    public int getDebtorAmount() {
        return debtorAmount;
    }

    @JsonProperty("debtorAmount")
    public void setDebtorAmount(int debtorAmount) {
        this.debtorAmount = debtorAmount;
    }

    @JsonProperty("debtorCurrency")
    public String getDebtorCurrency() {
        return debtorCurrency;
    }

    @JsonProperty("debtorCurrency")
    public void setDebtorCurrency(String debtorCurrency) {
        this.debtorCurrency = debtorCurrency;
    }

    @JsonProperty("creditorAmount")
    public int getCreditorAmount() {
        return creditorAmount;
    }

    @JsonProperty("creditorAmount")
    public void setCreditorAmount(int creditorAmount) {
        this.creditorAmount = creditorAmount;
    }

    @JsonProperty("creditorCurrency")
    public String getCreditorCurrency() {
        return creditorCurrency;
    }

    @JsonProperty("creditorCurrency")
    public void setCreditorCurrency(String creditorCurrency) {
        this.creditorCurrency = creditorCurrency;
    }

    @JsonProperty("creditorCurrencyDate")
    public String getCreditorCurrencyDate() {
        return creditorCurrencyDate;
    }

    @JsonProperty("creditorCurrencyDate")
    public void setCreditorCurrencyDate(String creditorCurrencyDate) {
        this.creditorCurrencyDate = creditorCurrencyDate;
    }

    @JsonProperty("exchangeRate")
    public int getExchangeRate() {
        return exchangeRate;
    }

    @JsonProperty("exchangeRate")
    public void setExchangeRate(int exchangeRate) {
        this.exchangeRate = exchangeRate;
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
