package com.tompee.nicehash.api.model.detailedproviderstat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Detailed provider current statistics model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Current {
    @JsonProperty("profitability")
    private String profitability;
    @JsonProperty("data")
    private List<Object> data = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("suffix")
    private String suffix;
    @JsonProperty("algo")
    private Integer algo;

    public String getProfitability() {
        return profitability;
    }

    public void setProfitability(String profitability) {
        this.profitability = profitability;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Integer getAlgo() {
        return algo;
    }

    public void setAlgo(Integer algo) {
        this.algo = algo;
    }
}
