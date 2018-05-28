package com.tompee.nicehash.api;

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
import com.tompee.nicehash.api.model.worker.WorkerDetails;

/**
 * Nicehash API Async Rest client facade. Operations are asynchronous
 */
public interface NicehashApiAsyncRestClient {
    /**
     * Check API version
     *
     * @param callback callback that handles the response
     */
    void getVersion(NicehashApiCallback<MethodResult<Version>> callback);

    /**
     * Check current global profitability
     *
     * @param callback callback that handles the response
     */
    void getCurrentGlobalProfitability(NicehashApiCallback<MethodResult<GlobalCurrent>> callback);

    /**
     * Check current global profitability by location
     *
     * @param location location
     * @param callback callback that handles the response
     */
    void getCurrentGlobalProfitability(NicehashApiLocation location, NicehashApiCallback<MethodResult<GlobalCurrent>> callback);

    /**
     * Check average global profitability
     *
     * @param callback callback that handles the response
     */
    void getAverageGlobalProfitability(NicehashApiCallback<MethodResult<GlobalAverage>> callback);

    /**
     * Check provider statistics
     *
     * @param address  Provider address
     * @param callback callback that handles the response
     */
    void getProviderStatistics(String address, NicehashApiCallback<MethodResult<ProviderStat>> callback);

    /**
     * Check detailed provider statistics
     *
     * @param address Provider address
     * @param callback callback that handles the response
     */
    void getDetailedProviderStatistics(String address, NicehashApiCallback<MethodResult<DetailedProviderStat>> callback);

    /**
     * Check detailed provider statistics
     *
     * @param address   Provider address
     * @param timestamp Unix timestamp
     * @param callback callback that handles the response
     */
    void getDetailedProviderStatistics(String address, long timestamp, NicehashApiCallback<MethodResult<DetailedProviderStat>> callback);

    /**
     * Check payments
     *
     * @param address  Provider address
     * @param callback callback that handles the response
     */
    void getPayments(String address, NicehashApiCallback<MethodResult<Payment>> callback);

    /**
     * Check payments
     *
     * @param address   Provider address
     * @param timestamp Unix timestamp
     * @param callback  callback that handles the response
     */
    void getPayments(String address, long timestamp, NicehashApiCallback<MethodResult<Payment>> callback);

    /**
     * Check worker details
     *
     * @param address Provider details
     * @param callback callback that handles the response
     */
    void getWorkerDetails(String address, NicehashApiCallback<MethodResult<WorkerDetails>> callback);

    /**
     * Check worker details
     *
     * @param address   Provider details
     * @param algorithm Algorithm
     * @param callback callback that handles the response
     */
    void getWorkerDetails(String address, NicehashApiAlgorithm algorithm, NicehashApiCallback<MethodResult<WorkerDetails>> callback);

    /**
     * Check order details
     *
     * @param location  Location
     * @param algorithm Algorithm
     * @param callback  callback that handles the response
     */
    void getOrderDetails(NicehashApiLocation location, NicehashApiAlgorithm algorithm, NicehashApiCallback<MethodResult<OrderDetails>> callback);

    /**
     * Check multi algo info
     *
     * @param callback callback that handles the response
     */
    void getMultiAlgoInfo(NicehashApiCallback<MethodResult<MultiAlgoInfo>> callback);

    /**
     * Check simple multi algo info
     *
     * @param callback callback that handles the response
     */
    void getSimpleMultiAlgoInfo(NicehashApiCallback<MethodResult<SimpleMultiAlgoInfo>> callback);

    /**
     * Check buy info
     *
     * @param callback callback that handles the response
     */
    void getBuyInfo(NicehashApiCallback<MethodResult<BuyInfo>> callback);
}
