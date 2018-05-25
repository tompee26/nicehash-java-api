package com.tompee.nicehash.api.model.version;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tompee.nicehash.api.model.ResultBase;

/**
 * Version model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Version extends ResultBase {
    @JsonProperty("api_version")
    private String apiVersion;

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }
}