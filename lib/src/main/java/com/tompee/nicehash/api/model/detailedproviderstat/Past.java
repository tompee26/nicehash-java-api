package com.tompee.nicehash.api.model.detailedproviderstat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Detailed provider statistics past model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Past {
    @JsonProperty("data")
    private List<Object> data = null;
    @JsonProperty("algo")
    private Integer algo;

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public Integer getAlgo() {
        return algo;
    }

    public void setAlgo(Integer algo) {
        this.algo = algo;
    }
}
