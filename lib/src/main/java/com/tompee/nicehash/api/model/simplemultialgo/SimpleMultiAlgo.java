package com.tompee.nicehash.api.model.simplemultialgo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SimpleMultiAlgo {
    private String paying;
    private Integer port;
    private String name;
    private Integer algo;

    public String getPaying() {
        return paying;
    }

    public void setPaying(String paying) {
        this.paying = paying;
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
