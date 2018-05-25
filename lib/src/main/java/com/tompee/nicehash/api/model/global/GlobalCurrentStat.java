package com.tompee.nicehash.api.model.global;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Global Current Statistics model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GlobalCurrentStat {
    @JsonProperty("profitability_above_ltc")
    private String profitabilityAboveLtc;
    @JsonProperty("price")
    private String price;
    @JsonProperty("profitability_ltc")
    private String profitabilityLtc;
    @JsonProperty("algo")
    private Integer algo;
    @JsonProperty("speed")
    private String speed;
    @JsonProperty("profitability_btc")
    private String profitabilityBtc;
    @JsonProperty("profitability_above_btc")
    private String profitabilityAboveBtc;
    @JsonProperty("profitability_eth")
    private String profitabilityEth;
    @JsonProperty("profitability_above_eth")
    private String profitabilityAboveEth;

    public String getProfitabilityAboveLtc() {
        return profitabilityAboveLtc;
    }

    public void setProfitabilityAboveLtc(String profitabilityAboveLtc) {
        this.profitabilityAboveLtc = profitabilityAboveLtc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProfitabilityLtc() {
        return profitabilityLtc;
    }

    public void setProfitabilityLtc(String profitabilityLtc) {
        this.profitabilityLtc = profitabilityLtc;
    }

    public Integer getAlgo() {
        return algo;
    }

    public void setAlgo(Integer algo) {
        this.algo = algo;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getProfitabilityBtc() {
        return profitabilityBtc;
    }

    public void setProfitabilityBtc(String profitabilityBtc) {
        this.profitabilityBtc = profitabilityBtc;
    }

    public String getProfitabilityAboveBtc() {
        return profitabilityAboveBtc;
    }

    public void setProfitabilityAboveBtc(String profitabilityAboveBtc) {
        this.profitabilityAboveBtc = profitabilityAboveBtc;
    }

    public String getProfitabilityEth() {
        return profitabilityEth;
    }

    public void setProfitabilityEth(String profitabilityEth) {
        this.profitabilityEth = profitabilityEth;
    }

    public String getProfitabilityAboveEth() {
        return profitabilityAboveEth;
    }

    public void setProfitabilityAboveEth(String profitabilityAboveEth) {
        this.profitabilityAboveEth = profitabilityAboveEth;
    }
}