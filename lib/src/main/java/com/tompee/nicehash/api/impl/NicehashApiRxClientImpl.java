package com.tompee.nicehash.api.impl;

import com.tompee.nicehash.api.NicehashApiRxClient;
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

import io.reactivex.Single;

import static com.tompee.nicehash.api.NicehashApiHelper.convertAlgoToCode;
import static com.tompee.nicehash.api.NicehashApiHelper.convertLocationToCode;
import static com.tompee.nicehash.api.impl.NicehashApiServiceManager.createRxService;

public class NicehashApiRxClientImpl implements NicehashApiRxClient {
    private NicehashApiRxService apiService;

    public NicehashApiRxClientImpl() {
        apiService = createRxService();
    }

    @Override
    public Single<MethodResult<Version>> getVersion() {
        return apiService.getVersion();
    }

    @Override
    public Single<MethodResult<GlobalCurrent>> getCurrentGlobalProfitability() {
        return apiService.getCurrentGlobalProfitability();
    }

    @Override
    public Single<MethodResult<GlobalCurrent>> getCurrentGlobalProfitability(NicehashApiLocation location) {
        return apiService.getCurrentGlobalProfitability(convertLocationToCode(location));
    }

    @Override
    public Single<MethodResult<GlobalAverage>> getAverageGlobalProfitability() {
        return apiService.getGlobalAverageProfitability();
    }

    @Override
    public Single<MethodResult<ProviderStat>> getProviderStatistics(String address) {
        return apiService.getProviderStatistics(address);
    }

    @Override
    public Single<MethodResult<Payment>> getPayments(String address) {
        return apiService.getPayments(address);
    }

    @Override
    public Single<MethodResult<Payment>> getPayments(String address, long timestamp) {
        return apiService.getPayments(address, timestamp);
    }

    @Override
    public Single<MethodResult<OrderDetails>> getOrderDetails(NicehashApiLocation location, NicehashApiAlgorithm algorithm) {
        return apiService.getOrders(convertLocationToCode(location), convertAlgoToCode(algorithm));
    }

    @Override
    public Single<MethodResult<MultiAlgoInfo>> getMultiAlgoInfo() {
        return apiService.getMultiAlgoInfo();
    }

    @Override
    public Single<MethodResult<SimpleMultiAlgoInfo>> getSimpleMultiAlgoInfo() {
        return apiService.getSimpleMultiAlgoInfo();
    }

    @Override
    public Single<MethodResult<BuyInfo>> getBuyInfo() {
        return apiService.getBuyInfo();
    }
}
