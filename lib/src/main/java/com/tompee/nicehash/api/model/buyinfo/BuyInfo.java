package com.tompee.nicehash.api.model.buyinfo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tompee.nicehash.api.model.ResultBase;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BuyInfo extends ResultBase {
    private List<Algorithm> algorithms = null;
    @JsonProperty("down_time")
    private Integer downTime;
    @JsonProperty("static_fee")
    private String staticFee;
    @JsonProperty("min_amount")
    private String minAmount;
    @JsonProperty("dynamic_fee")
    private String dynamicFee;

    public List<Algorithm> getAlgorithms() {
        return algorithms;
    }

    public void setAlgorithms(List<Algorithm> algorithms) {
        this.algorithms = algorithms;
    }

    public Integer getDownTime() {
        return downTime;
    }

    public void setDownTime(Integer downTime) {
        this.downTime = downTime;
    }

    public String getStaticFee() {
        return staticFee;
    }

    public void setStaticFee(String staticFee) {
        this.staticFee = staticFee;
    }

    public String getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(String minAmount) {
        this.minAmount = minAmount;
    }

    public String getDynamicFee() {
        return dynamicFee;
    }

    public void setDynamicFee(String dynamicFee) {
        this.dynamicFee = dynamicFee;
    }
}
