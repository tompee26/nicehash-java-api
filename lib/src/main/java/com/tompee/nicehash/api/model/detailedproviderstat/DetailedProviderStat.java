package com.tompee.nicehash.api.model.detailedproviderstat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Detailed provider statistics model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DetailedProviderStat {
    @JsonProperty("current")
    private List<Current> current = null;
    @JsonProperty("nh_wallet")
    private Boolean nhWallet;
    @JsonProperty("past")
    private List<Past> past = null;
    @JsonProperty("payments")
    private List<Object> payments = null;
    @JsonProperty("addr")
    private String addr;

    @JsonProperty("current")
    public List<Current> getCurrent() {
        return current;
    }

    public void setCurrent(List<Current> current) {
        this.current = current;
    }

    public Boolean getNhWallet() {
        return nhWallet;
    }

    public void setNhWallet(Boolean nhWallet) {
        this.nhWallet = nhWallet;
    }

    public List<Past> getPast() {
        return past;
    }

    public void setPast(List<Past> past) {
        this.past = past;
    }

    public List<Object> getPayments() {
        return payments;
    }

    public void setPayments(List<Object> payments) {
        this.payments = payments;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
