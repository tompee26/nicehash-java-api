package com.tompee.nicehash.api.model.average;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tompee.nicehash.api.model.ResultBase;

import java.util.List;

/**
 * Global average profitability model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GlobalAverage extends ResultBase {
    @JsonProperty("stats")
    private List<GlobalAverageStat> stats = null;

    public List<GlobalAverageStat> getStats() {
        return stats;
    }

    public void setStats(List<GlobalAverageStat> stats) {
        this.stats = stats;
    }
}
