package com.tompee.nicehash.api;

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


/**
 * Nicehash API Reactive Rest client facade. Objects are observables.
 */
public interface NicehashApiRxClient {
    /**
     * Check API version
     *
     * @return API version
     */
    Single<MethodResult<Version>> getVersion();

    /**
     * Check current global profitability
     *
     * @return Global current profitability
     */
    Single<MethodResult<GlobalCurrent>> getCurrentGlobalProfitability();

    /**
     * Check current global profitability
     *
     * @param location location
     * @return Global current profitability
     */
    Single<MethodResult<GlobalCurrent>> getCurrentGlobalProfitability(NicehashApiLocation location);

    /**
     * Check average global profitability
     *
     * @return Global average profitability
     */
    Single<MethodResult<GlobalAverage>> getAverageGlobalProfitability();

    /**
     * Check provider statistics
     *
     * @param address Provider address
     * @return Provider statistics
     */
    Single<MethodResult<ProviderStat>> getProviderStatistics(String address);

    /**
     * Check detailed provider statistics
     *
     * @param address Provider address
     * @return Detailed provider statistics
     */
    //Single<MethodResult<DetailedProviderStat>> getDetailedProviderStatistics(String address);

    /**
     * Check detailed provider statistics
     *
     * @param address   Provider address
     * @param timestamp Unix timestamp
     * @return Detailed provider statistics
     */
    //Single<MethodResult<DetailedProviderStat>> getDetailedProviderStatistics(String address, long timestamp);

    /**
     * Check payments
     *
     * @param address Provider address
     * @return Payments
     */
    Single<MethodResult<Payment>> getPayments(String address);

    /**
     * Check payments
     *
     * @param address   Provider address
     * @param timestamp Unix timestamp
     * @return Payments
     */
    Single<MethodResult<Payment>> getPayments(String address, long timestamp);

    /**
     * Check worker details
     *
     * @param address Provider details
     * @return Worker details
     */
    //Single<MethodResult<WorkerDetails>> getWorkerDetails(String address);

    /**
     * Check worker details
     *
     * @param address   Provider details
     * @param algorithm Algorithm
     * @return Worker details
     */
    //Single<MethodResult<WorkerDetails>> getWorkerDetails(String address, NicehashApiAlgorithm algorithm);

    /**
     * Check order details
     *
     * @param location  Location
     * @param algorithm Algorithm
     * @return Worker details
     */
    Single<MethodResult<OrderDetails>> getOrderDetails(NicehashApiLocation location, NicehashApiAlgorithm algorithm);

    /**
     * Check multi algo info
     */
    Single<MethodResult<MultiAlgoInfo>> getMultiAlgoInfo();

    /**
     * Check simple multi algo info
     */
    Single<MethodResult<SimpleMultiAlgoInfo>> getSimpleMultiAlgoInfo();

    /**
     * Check buy info
     */
    Single<MethodResult<BuyInfo>> getBuyInfo();
}
