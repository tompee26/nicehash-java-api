package com.tompee.nicehash.api.model.multialgo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tompee.nicehash.api.model.ResultBase;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MultiAlgoInfo extends ResultBase {
    @JsonProperty("multialgo")
    private List<MultiAlgo> multiAlgo = null;

    public List<MultiAlgo> getMultialgo() {
        return multiAlgo;
    }

    public void setMultialgo(List<MultiAlgo> multialgo) {
        this.multiAlgo = multialgo;
    }
}
