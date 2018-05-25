package com.tompee.nicehash.api.model.global;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Current global profitability model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GlobalCurrent {
    private List<GlobalCurrentStat> stats = null;

    public List<GlobalCurrentStat> getGlobalCurrentStats() {
        return stats;
    }

    public void setGlobalCurrentStats(List<GlobalCurrentStat> globalCurrentStats) {
        this.stats = globalCurrentStats;
    }
}
