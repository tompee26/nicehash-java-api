package com.tompee.nicehash.api.impl;

import com.tompee.nicehash.api.constants.NicehashApiConstants;
import com.tompee.nicehash.api.exception.NicehashApiException;
import com.tompee.nicehash.api.model.NicehashApiError;

import java.io.IOException;
import java.lang.annotation.Annotation;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Creates and manages the Nicehash API service
 */
class NicehashApiServiceManager {

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    private static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(NicehashApiConstants.BASE_URL)
            .addConverterFactory(JacksonConverterFactory.create());

    private static Retrofit retrofit = builder.build();

    static NicehashApiService createService() {
        return retrofit.create(NicehashApiService.class);
    }

    /**
     * Execute a REST call and block until the response is received.
     */
    static <T> T executeSync(Call<T> call) {
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            } else {
                NicehashApiError apiError = getNicehashApiError(response);
                throw new NicehashApiException(apiError);
            }
        } catch (IOException e) {
            throw new NicehashApiException(e);
        }
    }

    private static NicehashApiError getNicehashApiError(Response<?> response) throws IOException, NicehashApiException {
        return (NicehashApiError) retrofit.responseBodyConverter(NicehashApiError.class, new Annotation[0])
                .convert(response.errorBody());
    }
}
