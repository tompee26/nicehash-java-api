package com.tompee.nicehash.api.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tompee.nicehash.api.model.ResultBase;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDetails extends ResultBase {
    private List<Order> orders = null;
    private Integer timestamp;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }
}
