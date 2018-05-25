package com.tompee.nicehash.api.impl;

import com.tompee.nicehash.api.NicehashApiCallback;
import com.tompee.nicehash.api.exception.NicehashApiException;
import com.tompee.nicehash.api.model.NicehashApiError;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Adapter used to convert a retrofit callback to a Nicehash API callback
 */
public class NicehashApiCallbackAdapter<T> implements Callback<T> {
    private NicehashApiCallback<T> callback;

    NicehashApiCallbackAdapter(NicehashApiCallback<T> callback) {
        this.callback = callback;
    }

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        if (callback != null) {
            if (response.isSuccessful()) {
                callback.onResponse(response.body());
            } else {
                try {
                    NicehashApiError apiError = NicehashApiServiceManager.getNicehashApiError(response);
                    onFailure(call, new NicehashApiException(apiError));
                } catch (IOException e) {
                    onFailure(call, new NicehashApiException(e));
                }
            }
        }
    }

    @Override
    public void onFailure(Call<T> call, Throwable throwable) {
        if (throwable instanceof NicehashApiException) {
            callback.onFailure(throwable);
        } else {
            callback.onFailure(new NicehashApiException(throwable));
        }
    }
}
