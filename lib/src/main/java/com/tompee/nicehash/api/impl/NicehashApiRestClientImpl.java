package com.tompee.nicehash.api.impl;

import com.tompee.nicehash.api.NicehashApiRestClient;
import com.tompee.nicehash.api.model.MethodResult;
import com.tompee.nicehash.api.model.NicehashApiAlgorithm;
import com.tompee.nicehash.api.model.NicehashApiLocation;
import com.tompee.nicehash.api.model.SimpleMultiAlgoInfo;
import com.tompee.nicehash.api.model.average.GlobalAverage;
import com.tompee.nicehash.api.model.buyinfo.BuyInfo;
import com.tompee.nicehash.api.model.detailedproviderstat.DetailedProviderStat;
import com.tompee.nicehash.api.model.global.GlobalCurrent;
import com.tompee.nicehash.api.model.multialgo.MultiAlgoInfo;
import com.tompee.nicehash.api.model.order.OrderDetails;
import com.tompee.nicehash.api.model.payments.Payment;
import com.tompee.nicehash.api.model.providerstat.ProviderStat;
import com.tompee.nicehash.api.model.version.Version;

import static com.tompee.nicehash.api.NicehashApiHelper.convertAlgoToCode;
import static com.tompee.nicehash.api.NicehashApiHelper.convertLocationToCode;
import static com.tompee.nicehash.api.impl.NicehashApiServiceManager.createService;
import static com.tompee.nicehash.api.impl.NicehashApiServiceManager.executeSync;

/**
 * Implementation of Nicehash API using Retrofit. Operations are synchronous.
 */
public class NicehashApiRestClientImpl implements NicehashApiRestClient {

    private NicehashApiService apiService;

    public NicehashApiRestClientImpl() {
        apiService = createService();
    }

    @Override
    public MethodResult<Version> getVersion() {
        return executeSync(apiService.getVersion());
    }

    @Override
    public MethodResult<GlobalCurrent> getCurrentGlobalProfitability() {
        return executeSync(apiService.getCurrentGlobalProfitability());
    }

    @Override
    public MethodResult<GlobalCurrent> getCurrentGlobalProfitabilityEu() {
        return executeSync(apiService.getCurrentGlobalProfitability(0));
    }

    @Override
    public MethodResult<GlobalCurrent> getCurrentGlobalProfitabilityUs() {
        return executeSync(apiService.getCurrentGlobalProfitability(1));
    }

    @Override
    public MethodResult<GlobalAverage> getAverageGlobalProfitability() {
        return executeSync(apiService.getGlobalAverageProfitability());
    }

    @Override
    public MethodResult<ProviderStat> getProviderStatistics(String address) {
        return executeSync(apiService.getProviderStatistics(address));
    }

//    @Override
//    public MethodResult<DetailedProviderStat> getDetailedProviderStatistics(String address) {
//        return executeSync(apiService.getDetailedProviderStatistics(address));
//    }
//
//    @Override
//    public MethodResult<DetailedProviderStat> getDetailedProviderStatistics(String address, long timestamp) {
//        return NicehasApiServiceManager.executeSync(apiService.getDetailedProviderStatistics(address, timestamp));
//    }

    @Override
    public MethodResult<Payment> getPayments(String address) {
        return executeSync(apiService.getPayments(address));
    }

    @Override
    public MethodResult<Payment> getPayments(String address, long timestamp) {
        return executeSync(apiService.getPayments(address, timestamp));
    }

//    @Override
//    public MethodResult<WorkerDetails> getWorkerDetails(String address) {
//        return NicehasApiServiceManager.executeSync(apiService.getWorkerDetails(address));
//    }
//
//    @Override
//    public MethodResult<WorkerDetails> getWorkerDetails(String address, NicehashApiAlgorithm algorithm) {
//        return NicehasApiServiceManager.executeSync(apiService.getWorkerDetails(address, NicehashApiHelper.convertAlgoToCode(algorithm)));
//    }

    @Override
    public MethodResult<OrderDetails> getOrderDetails(NicehashApiLocation location, NicehashApiAlgorithm algorithm) {
        return executeSync(apiService.getOrders(convertLocationToCode(location), convertAlgoToCode(algorithm)));
    }

    @Override
    public MethodResult<MultiAlgoInfo> getMultiAlgoInfo() {
        return executeSync(apiService.getMultiAlgoInfo());
    }

    @Override
    public MethodResult<SimpleMultiAlgoInfo> getSimpleMultiAlgoInfo() {
        return executeSync(apiService.getSimpleMultiAlgoInfo());
    }

    @Override
    public MethodResult<BuyInfo> getBuyInfo() {
        return executeSync(apiService.getBuyInfo());
    }
}
