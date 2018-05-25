package com.tompee.nicehash.api.model.multialgo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MultiAlgo {
    @JsonProperty("default_factor")
    private Double defaultFactor;
    private Integer port;
    private String name;
    private Integer algo;

    public Double getDefaultFactor() {
        return defaultFactor;
    }

    public void setDefaultFactor(Double defaultFactor) {
        this.defaultFactor = defaultFactor;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAlgo() {
        return algo;
    }

    public void setAlgo(Integer algo) {
        this.algo = algo;
    }
}
