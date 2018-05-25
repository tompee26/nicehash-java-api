package com.tompee.nicehash.api.model;

/**
 * Generic method result
 *
 * @param <T> Result model
 */
public class MethodResult<T> {
    private T result;
    private String method;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
