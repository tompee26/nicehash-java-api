package com.tompee.nicehash.api.model.payments;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Payment details model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDetails {
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("fee")
    private String fee;
    @JsonProperty("TXID")
    private String tXID;
    @JsonProperty("time")
    private Integer time;
    @JsonProperty("type")
    private Integer type;

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

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
