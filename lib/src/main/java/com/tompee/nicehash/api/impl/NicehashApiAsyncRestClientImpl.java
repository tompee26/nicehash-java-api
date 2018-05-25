package com.tompee.nicehash.api.impl;

import com.tompee.nicehash.api.NicehashApiAsyncRestClient;
import com.tompee.nicehash.api.NicehashApiCallback;
import com.tompee.nicehash.api.model.MethodResult;
import com.tompee.nicehash.api.model.NicehashApiAlgorithm;
import com.tompee.nicehash.api.model.NicehashApiLocation;
import com.tompee.nicehash.api.model.SimpleMultiAlgoInfo;
import com.tompee.nicehash.api.model.average.GlobalAverage;
import com.tompee.nicehash.api.model.buyinfo.BuyInfo;
import com.tompee.nicehash.api.model.global.GlobalCurrent;
import com.tompee.nicehash.api.model.multialgo.MultiAlgoInfo;
import com.tompee.nicehash.api.model.order.OrderDetails;
import com.tompee.nicehash.api.model.payments.Payment;
import com.tompee.nicehash.api.model.providerstat.ProviderStat;
import com.tompee.nicehash.api.model.version.Version;

import static com.tompee.nicehash.api.NicehashApiHelper.convertAlgoToCode;
import static com.tompee.nicehash.api.NicehashApiHelper.convertLocationToCode;
import static com.tompee.nicehash.api.impl.NicehashApiServiceManager.createService;
import static com.tompee.nicehash.api.impl.NicehashApiServiceManager.runAsync;

public class NicehashApiAsyncRestClientImpl implements NicehashApiAsyncRestClient {
    private NicehashApiService apiService;

    public NicehashApiAsyncRestClientImpl() {
        apiService = createService();
    }

    @Override
    public void getVersion(NicehashApiCallback<MethodResult<Version>> callback) {
        runAsync(apiService.getVersion(), new NicehashApiCallbackAdapter<>(callback));
    }

    @Override
    public void getCurrentGlobalProfitability(NicehashApiCallback<MethodResult<GlobalCurrent>> callback) {
        runAsync(apiService.getCurrentGlobalProfitability(), new NicehashApiCallbackAdapter<>(callback));
    }

    @Override
    public void getCurrentGlobalProfitability(NicehashApiLocation location, NicehashApiCallback<MethodResult<GlobalCurrent>> callback) {
        runAsync(apiService.getCurrentGlobalProfitability(convertLocationToCode(location)), new NicehashApiCallbackAdapter<>(callback));
    }

    @Override
    public void getAverageGlobalProfitability(NicehashApiCallback<MethodResult<GlobalAverage>> callback) {
        runAsync(apiService.getGlobalAverageProfitability(), new NicehashApiCallbackAdapter<>(callback));
    }

    @Override
    public void getProviderStatistics(String address, NicehashApiCallback<MethodResult<ProviderStat>> callback) {
        runAsync(apiService.getProviderStatistics(address), new NicehashApiCallbackAdapter<>(callback));
    }

    @Override
    public void getPayments(String address, NicehashApiCallback<MethodResult<Payment>> callback) {
        runAsync(apiService.getPayments(address), new NicehashApiCallbackAdapter<>(callback));
    }

    @Override
    public void getPayments(String address, long timestamp, NicehashApiCallback<MethodResult<Payment>> callback) {
        runAsync(apiService.getPayments(address, timestamp), new NicehashApiCallbackAdapter<>(callback));
    }

    @Override
    public void getOrderDetails(NicehashApiLocation location, NicehashApiAlgorithm algorithm, NicehashApiCallback<MethodResult<OrderDetails>> callback) {
        runAsync(apiService.getOrders(convertLocationToCode(location), convertAlgoToCode(algorithm)), new NicehashApiCallbackAdapter<>(callback));
    }

    @Override
    public void getMultiAlgoInfo(NicehashApiCallback<MethodResult<MultiAlgoInfo>> callback) {
        runAsync(apiService.getMultiAlgoInfo(), new NicehashApiCallbackAdapter<>(callback));
    }

    @Override
    public void getSimpleMultiAlgoInfo(NicehashApiCallback<MethodResult<SimpleMultiAlgoInfo>> callback) {
        runAsync(apiService.getSimpleMultiAlgoInfo(), new NicehashApiCallbackAdapter<>(callback));
    }

    @Override
    public void getBuyInfo(NicehashApiCallback<MethodResult<BuyInfo>> callback) {
        runAsync(apiService.getBuyInfo(), new NicehashApiCallbackAdapter<>(callback));
    }
}
