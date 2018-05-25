package com.tompee.nicehash.api.model.providerstat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Provider stats model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stats {
    @JsonProperty("balance")
    private String balance;
    @JsonProperty("rejected_speed")
    private String rejectedSpeed;
    @JsonProperty("algo")
    private Integer algo;
    @JsonProperty("accepted_speed")
    private String acceptedSpeed;

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getRejectedSpeed() {
        return rejectedSpeed;
    }

    public void setRejectedSpeed(String rejectedSpeed) {
        this.rejectedSpeed = rejectedSpeed;
    }

    public Integer getAlgo() {
        return algo;
    }

    public void setAlgo(Integer algo) {
        this.algo = algo;
    }

    public String getAcceptedSpeed() {
        return acceptedSpeed;
    }

    public void setAcceptedSpeed(String acceptedSpeed) {
        this.acceptedSpeed = acceptedSpeed;
    }
}
