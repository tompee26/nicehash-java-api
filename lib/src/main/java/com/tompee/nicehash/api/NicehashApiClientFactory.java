package com.tompee.nicehash.api;

import com.tompee.nicehash.api.impl.NicehashApiAsyncRestClientImpl;
import com.tompee.nicehash.api.impl.NicehashApiRestClientImpl;
import com.tompee.nicehash.api.impl.NicehashApiRxClientImpl;

public class NicehashApiClientFactory {

    /**
     * Instantiates a new api client factory
     */
    private NicehashApiClientFactory() {
    }

    /**
     * Creates a new instance of the API client
     *
     * @return The nicehash api client factory
     */
    public static NicehashApiClientFactory createInstance() {
        return new NicehashApiClientFactory();
    }

    /**
     * Creates a new instance of the REST client
     *
     * @return The nicehash rest client
     */
    public NicehashApiRestClient createRestClient() {
        return new NicehashApiRestClientImpl();
    }

    /**
     * Creates a new instance of the asynchronous REST client
     *
     * @return The nicehash async rest client
     */
    public NicehashApiAsyncRestClient createAsyncRestClient() {
        return new NicehashApiAsyncRestClientImpl();
    }

    /**
     * Creates a new instance of the Rx client
     *
     * @return The nicehash rx rest client
     */
    public NicehashApiRxClient createRxClient() {
        return new NicehashApiRxClientImpl();
    }

}
