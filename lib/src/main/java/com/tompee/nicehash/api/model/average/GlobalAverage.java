package com.tompee.nicehash.api.model.average;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Global average profitability model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GlobalAverage {
    @JsonProperty("stats")
    private List<GlobalAverageStat> stats = null;

    public List<GlobalAverageStat> getStats() {
        return stats;
    }

    public void setStats(List<GlobalAverageStat> stats) {
        this.stats = stats;
    }
}
