package com.tompee.nicehash.api.model.detailedproviderstat;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Detailed provider statistics data model
 */
public class Data {
    private double accepted;
    private double rejectedTarget;
    private double rejectedStale;
    private double rejectedDuplicate;
    private double rejectedOther;
    private double balance;

    public Data(List<Object> data) {
        if (data.get(0) instanceof LinkedHashMap) {
            LinkedHashMap table = (LinkedHashMap) data.get(0);
            for (Object object : table.keySet()) {
                if (object instanceof String) {
                    setValue(object.toString(), table.get(object));
                }
            }
        }
        if (data.get(1) instanceof String) {
            balance = Double.parseDouble(data.get(1).toString());
        }
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

    public void setRejectedTarget(double rejected) {
        this.rejectedTarget = rejected;
    }

    public double getRejectedStale() {
        return rejectedStale;
    }

    public void setRejectedStale(double rejected) {
        this.rejectedStale = rejected;
    }

    public double getRejectedDuplicate() {
        return rejectedDuplicate;
    }

    public void setRejectedDuplicate(double rejected) {
        this.rejectedDuplicate = rejected;
    }

    public double getRejectedOther() {
        return rejectedOther;
    }

    public void setRejectedOther(double rejected) {
        this.rejectedOther = rejected;
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
