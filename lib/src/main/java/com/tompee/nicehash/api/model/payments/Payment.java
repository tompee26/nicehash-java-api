package com.tompee.nicehash.api.model.payments;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Payment model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Payment {

    @JsonProperty("nh_wallet")
    private Boolean nhWallet;
    @JsonProperty("payments")
    private List<PaymentDetails> payments = null;
    @JsonProperty("addr")
    private String addr;

    public Boolean getNhWallet() {
        return nhWallet;
    }

    public void setNhWallet(Boolean nhWallet) {
        this.nhWallet = nhWallet;
    }

    public List<PaymentDetails> getPayments() {
        return payments;
    }

    public void setPayments(List<PaymentDetails> payments) {
        this.payments = payments;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
