package com.tompee.nicehash.api.model.worker;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Worker details model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkerDetails {
    private String addr;
    private List<List<String>> workers = null;
    private Integer algo;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public List<List<String>> getWorkers() {
        return workers;
    }

    public void setWorkers(List<List<String>> workers) {
        this.workers = workers;
    }

    public Integer getAlgo() {
        return algo;
    }

    public void setAlgo(Integer algo) {
        this.algo = algo;
    }
}
