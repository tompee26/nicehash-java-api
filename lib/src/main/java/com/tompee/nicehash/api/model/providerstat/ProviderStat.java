package com.tompee.nicehash.api.model.providerstat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tompee.nicehash.api.model.ResultBase;

import java.util.List;

/**
 * Provider Statistics model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProviderStat extends ResultBase {
    private List<Stats> stats = null;
    private List<ProviderPayment> payments = null;
    private String addr;

    public List<Stats> getStats() {
        return stats;
    }

    public void setStats(List<Stats> stats) {
        this.stats = stats;
    }

    public List<ProviderPayment> getPayments() {
        return payments;
    }

    public void setPayments(List<ProviderPayment> payments) {
        this.payments = payments;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
