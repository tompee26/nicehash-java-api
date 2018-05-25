package com.tompee.nicehash.api.model.buyinfo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Algorithm {
    @JsonProperty("down_step")
    private String downStep;
    @JsonProperty("min_diff_working")
    private String minDiffWorking;
    @JsonProperty("min_limit")
    private String minLimit;
    @JsonProperty("speed_text")
    private String speedText;
    @JsonProperty("min_diff_initial")
    private String minDiffInitial;
    private String name;
    private Integer algo;
    private String multi;

    public String getDownStep() {
        return downStep;
    }

    public void setDownStep(String downStep) {
        this.downStep = downStep;
    }

    public String getMinDiffWorking() {
        return minDiffWorking;
    }

    public void setMinDiffWorking(String minDiffWorking) {
        this.minDiffWorking = minDiffWorking;
    }

    public String getMinLimit() {
        return minLimit;
    }

    public void setMinLimit(String minLimit) {
        this.minLimit = minLimit;
    }

    public String getSpeedText() {
        return speedText;
    }

    public void setSpeedText(String speedText) {
        this.speedText = speedText;
    }

    public String getMinDiffInitial() {
        return minDiffInitial;
    }

    public void setMinDiffInitial(String minDiffInitial) {
        this.minDiffInitial = minDiffInitial;
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

    public String getMulti() {
        return multi;
    }

    public void setMulti(String multi) {
        this.multi = multi;
    }
}
