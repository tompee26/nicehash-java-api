package com.tompee.nicehash.api.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {
    @JsonProperty("limit_speed")
    private String limitSpeed;
    private Boolean alive;
    private String price;
    private Integer id;
    private Integer type;
    private Integer workers;
    private Integer algo;
    @JsonProperty("accepted_speed")
    private String acceptedSpeed;

    public String getLimitSpeed() {
        return limitSpeed;
    }

    public void setLimitSpeed(String limitSpeed) {
        this.limitSpeed = limitSpeed;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getWorkers() {
        return workers;
    }

    public void setWorkers(Integer workers) {
        this.workers = workers;
    }

    public Integer getAlgo() {
        return algo;
    }

    public void setAlgo(Integer algo) {
        this.algo = algo;
    }

    public String getAcceptedSpeed() {
        return acceptedSpeed;
    }

    public void setAcceptedSpeed(String acceptedSpeed) {
        this.acceptedSpeed = acceptedSpeed;
    }
}
