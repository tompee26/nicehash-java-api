package com.tompee.nicehash.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NicehashApiError {
    @JsonProperty("error")
    private String message;

    public String getErrorMessage() {
        return message;
    }

    public void setErrorMessage(String message) {
        this.message = message;
    }
}
