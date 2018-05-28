package com.tompee.nicehash.api.model.worker;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Worker {
    private String rigName;
    private double accepted;
    private double rejectedTarget;
    private double rejectedStale;
    private double rejectedDuplicate;
    private double rejectedOther;
    private int timeConnected;
    private boolean xnSubEnabled;
    private double difficulty;
    private int location;

    public Worker(Object worker) {
        if (worker instanceof ArrayList) {
            ArrayList listData = (ArrayList) worker;
            rigName = listData.get(0).toString();
            LinkedHashMap speedMap = (LinkedHashMap) listData.get(1);
            for (Object object : speedMap.keySet()) {
                if (object instanceof String) {
                    setValue(object.toString(), speedMap.get(object));
                }
            }
            timeConnected = (int) listData.get(2);
            int xnSub = (int) listData.get(3);
            xnSubEnabled = xnSub == 1;
            difficulty = Double.parseDouble(listData.get(4).toString());
            location = (int) listData.get(5);
        }
    }

    public String getRigName() {
        return rigName;
    }

    public void setRigName(String rigName) {
        this.rigName = rigName;
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

    public int getTimeConnected() {
        return timeConnected;
    }

    public void setTimeConnected(int timeConnected) {
        this.timeConnected = timeConnected;
    }

    public boolean isXnSubEnabled() {
        return xnSubEnabled;
    }

    public void setXnSubEnabled(boolean xnSubEnabled) {
        this.xnSubEnabled = xnSubEnabled;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
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
