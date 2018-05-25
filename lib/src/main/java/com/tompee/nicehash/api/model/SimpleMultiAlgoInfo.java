package com.tompee.nicehash.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tompee.nicehash.api.model.simplemultialgo.SimpleMultiAlgo;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SimpleMultiAlgoInfo {
    @JsonProperty("simplemultialgo")
    private List<SimpleMultiAlgo> simpleMultiAlgo = null;

    public List<SimpleMultiAlgo> getSimpleMultiAlgo() {
        return simpleMultiAlgo;
    }

    public void setSimpleMultiAlgo(List<SimpleMultiAlgo> simpleMultiAlgo) {
        this.simpleMultiAlgo = simpleMultiAlgo;
    }
}
