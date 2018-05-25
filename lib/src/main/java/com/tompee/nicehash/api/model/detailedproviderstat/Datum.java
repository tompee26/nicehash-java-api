package com.tompee.nicehash.api.model.detailedproviderstat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Detailed provider statistics datum model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Datum {
    @JsonProperty("a")
    private String accepted;
    @JsonProperty("rs")
    private String rejected;
    private String balance;

    /**
     * Constructor for unpaid balance
     */
    public Datum(String balance) {
        this.balance = balance;
    }

    public String getAccepted() {
        return accepted;
    }

    public void setAccepted(String accepted) {
        this.accepted = accepted;
    }

    public String getRejected() {
        return rejected;
    }

    public void setRejected(String rejected) {
        this.rejected = rejected;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
