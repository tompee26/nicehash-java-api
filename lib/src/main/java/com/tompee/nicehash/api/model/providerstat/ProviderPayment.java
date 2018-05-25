package com.tompee.nicehash.api.model.providerstat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Provider payment model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProviderPayment {
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("fee")
    private String fee;
    @JsonProperty("TXID")
    private String tXID;
    @JsonProperty("time")
    private String time;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getTXID() {
        return tXID;
    }

    public void setTXID(String tXID) {
        this.tXID = tXID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
