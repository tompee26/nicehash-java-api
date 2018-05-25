package com.tompee.nicehash.api.exception;

import com.tompee.nicehash.api.NicehashApiError;

/**
 * A custom exception that can be thrown when using Nicehash APIs
 */
public class NicehashApiException extends RuntimeException {

    private NicehashApiError error;

    /**
     * Instantiates a new Nicehash API exception
     */
    public NicehashApiException() {
        super();
    }

    public NicehashApiException(NicehashApiError error) {
        error = error;
    }

    /**
     * Instantiates a new Nicehash API exception
     *
     * @param message Exception message
     */
    public NicehashApiException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Nicehash API exception
     *
     * @param throwable Throwable
     */
    public NicehashApiException(Throwable throwable) {
        super(throwable);
    }

    /**
     * Instantiates a new Nicehash API exception
     *
     * @param message   Exception message
     * @param throwable Throwable
     */
    public NicehashApiException(String message, Throwable throwable) {
        super(message, throwable);
    }


    /**
     * Returns the instance of error if available
     *
     * @return Nicehash error
     */
    public NicehashApiError getError() {
        return this.error;
    }
}
