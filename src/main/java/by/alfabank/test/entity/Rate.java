package by.alfabank.test.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rate {
    private JsonNode rates;

    public JsonNode getRates() {
        return rates;
    }

    public void setRates(JsonNode rates) {
        this.rates = rates;
    }
}
