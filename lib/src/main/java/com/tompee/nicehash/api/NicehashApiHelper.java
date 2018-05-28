package com.tompee.nicehash.api;

import com.tompee.nicehash.api.model.NicehashApiAlgorithm;
import com.tompee.nicehash.api.model.NicehashApiLocation;
import com.tompee.nicehash.api.model.detailedproviderstat.Data;
import com.tompee.nicehash.api.model.detailedproviderstat.PastData;
import com.tompee.nicehash.api.model.worker.Worker;

import java.util.List;

public class NicehashApiHelper {

    public static NicehashApiAlgorithm convertCodeToAlgo(int code) {
        return NicehashApiAlgorithm.values()[code];
    }

    public static int convertAlgoToCode(NicehashApiAlgorithm algorithm) {
        return algorithm.ordinal();
    }

    public static NicehashApiLocation convertCodeToLocation(int code) {
        return NicehashApiLocation.values()[code];
    }

    public static int convertLocationToCode(NicehashApiLocation location) {
        return location.ordinal();
    }

    public static Data convertToDataObject(List<Object> data) {
        return new Data(data);
    }

    public static PastData convertToPastDataObject(Object data) {
        return new PastData(data);
    }

    public static Worker convertToWorkerObject(Object worker) {
        return new Worker(worker);
    }

}
