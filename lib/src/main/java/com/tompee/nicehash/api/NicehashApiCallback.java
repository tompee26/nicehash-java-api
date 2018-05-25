package com.tompee.nicehash.api;

/**
 * Callback used to return response asynchronously. Use together with the Async client
 *
 * @param <T> Return type
 */
public interface NicehashApiCallback<T> {
    /**
     * The successful response callback method
     *
     * @param response the response
     */
    void onResponse(T response);

    /**
     * The failed response callback method
     *
     * @param cause error cause
     */
    void onFailure(Throwable cause);
}
