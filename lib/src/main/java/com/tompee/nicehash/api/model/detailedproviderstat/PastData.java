package com.tompee.nicehash.api.model.detailedproviderstat;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class PastData {
    private long timestamp;
    private double accepted;
    private double rejectedTarget;
    private double rejectedStale;
    private double rejectedDuplicate;
    private double rejectedOther;
    private double balance;

    public PastData(Object data) {
        if (data instanceof ArrayList) {
            ArrayList listData = (ArrayList) data;
            if (listData.get(0) instanceof Integer) {
                timestamp = (long) ((int) listData.get(0)) * 3;
            }
            if (listData.get(1) instanceof LinkedHashMap) {
                LinkedHashMap table = (LinkedHashMap) listData.get(1);
                for (Object object : table.keySet()) {
                    if (object instanceof String) {
                        setValue(object.toString(), table.get(object));
                    }
                }
            }
            if (listData.get(2) instanceof String) {
                balance = Double.parseDouble(listData.get(2).toString());
            }
        }
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public double getAccepted() {
        return accepted;
    }

    public void setAccepted(double accepted) {
        this.accepted = accepted;
    }

    public double getRejectedTarget() {
        return rejectedTarget;
    }

    public void setRejectedTarget(double rejectedTarget) {
        this.rejectedTarget = rejectedTarget;
    }

    public double getRejectedStale() {
        return rejectedStale;
    }

    public void setRejectedStale(double rejectedStale) {
        this.rejectedStale = rejectedStale;
    }

    public double getRejectedDuplicate() {
        return rejectedDuplicate;
    }

    public void setRejectedDuplicate(double rejectedDuplicate) {
        this.rejectedDuplicate = rejectedDuplicate;
    }

    public double getRejectedOther() {
        return rejectedOther;
    }

    public void setRejectedOther(double rejectedOther) {
        this.rejectedOther = rejectedOther;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private void setValue(String key, Object value) {
        switch (key) {
            case "a":
                accepted = Double.parseDouble(value.toString());
                break;
            case "rt":
                rejectedTarget = Double.parseDouble(value.toString());
                break;
            case "rs":
                rejectedStale = Double.parseDouble(value.toString());
                break;
            case "rd":
                rejectedDuplicate = Double.parseDouble(value.toString());
                break;
            case "ro":
                rejectedOther = Double.parseDouble(value.toString());
                break;
        }
    }
}
