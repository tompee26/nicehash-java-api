package com.tompee.nicehash.api.model.average;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Global Average Statistics model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GlobalAverageStat {
    private String price;
    private Integer algo;
    private String speed;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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
}
