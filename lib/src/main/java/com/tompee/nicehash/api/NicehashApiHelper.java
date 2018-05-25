package com.tompee.nicehash.api;

import com.tompee.nicehash.api.model.NicehashApiAlgorithm;
import com.tompee.nicehash.api.model.NicehashApiLocation;

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
}
