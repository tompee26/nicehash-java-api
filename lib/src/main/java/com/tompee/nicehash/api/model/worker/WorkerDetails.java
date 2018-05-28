package com.tompee.nicehash.api.model.worker;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tompee.nicehash.api.model.ResultBase;

import java.util.List;

/**
 * Worker details model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkerDetails extends ResultBase {
    private String addr;
    private List<Object> workers = null;
    private Integer algo;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public List<Object> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Object> workers) {
        this.workers = workers;
    }

    public Integer getAlgo() {
        return algo;
    }

    public void setAlgo(Integer algo) {
        this.algo = algo;
    }
}
