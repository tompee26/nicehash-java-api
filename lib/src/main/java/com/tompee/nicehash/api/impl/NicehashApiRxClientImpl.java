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

import io.reactivex.Observable;

import static com.tompee.nicehash.api.NicehashApiHelper.convertAlgoToCode;
import static com.tompee.nicehash.api.NicehashApiHelper.convertLocationToCode;
import static com.tompee.nicehash.api.impl.NicehashApiServiceManager.createRxService;

public class NicehashApiRxClientImpl implements NicehashApiRxClient {
    private NicehashApiRxService apiService;

    public NicehashApiRxClientImpl() {
        apiService = createRxService();
    }

    @Override
    public Observable<MethodResult<Version>> getVersion() {
        return apiService.getVersion();
    }

    @Override
    public Observable<MethodResult<GlobalCurrent>> getCurrentGlobalProfitability() {
        return apiService.getCurrentGlobalProfitability();
    }

    @Override
    public Observable<MethodResult<GlobalCurrent>> getCurrentGlobalProfitability(NicehashApiLocation location) {
        return apiService.getCurrentGlobalProfitability(convertLocationToCode(location));
    }

    @Override
    public Observable<MethodResult<GlobalAverage>> getAverageGlobalProfitability() {
        return apiService.getGlobalAverageProfitability();
    }

    @Override
    public Observable<MethodResult<ProviderStat>> getProviderStatistics(String address) {
        return apiService.getProviderStatistics(address);
    }

    @Override
    public Observable<MethodResult<Payment>> getPayments(String address) {
        return apiService.getPayments(address);
    }

    @Override
    public Observable<MethodResult<Payment>> getPayments(String address, long timestamp) {
        return apiService.getPayments(address, timestamp);
    }

    @Override
    public Observable<MethodResult<OrderDetails>> getOrderDetails(NicehashApiLocation location, NicehashApiAlgorithm algorithm) {
        return apiService.getOrders(convertLocationToCode(location), convertAlgoToCode(algorithm));
    }

    @Override
    public Observable<MethodResult<MultiAlgoInfo>> getMultiAlgoInfo() {
        return apiService.getMultiAlgoInfo();
    }

    @Override
    public Observable<MethodResult<SimpleMultiAlgoInfo>> getSimpleMultiAlgoInfo() {
        return apiService.getSimpleMultiAlgoInfo();
    }

    @Override
    public Observable<MethodResult<BuyInfo>> getBuyInfo() {
        return apiService.getBuyInfo();
    }
}
