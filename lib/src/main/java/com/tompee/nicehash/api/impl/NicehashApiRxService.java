package com.tompee.nicehash.api.impl;

import com.tompee.nicehash.api.model.MethodResult;
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

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Nicehash's API URL mappings
 */
public interface NicehashApiRxService {

    @GET("/api")
    Single<MethodResult<Version>> getVersion();

    @GET("/api?method=stats.global.current")
    Single<MethodResult<GlobalCurrent>> getCurrentGlobalProfitability();

    @GET("/api?method=stats.global.current")
    Single<MethodResult<GlobalCurrent>> getCurrentGlobalProfitability(@Query("location") int location);

    @GET("/api?method=stats.global.24h")
    Single<MethodResult<GlobalAverage>> getGlobalAverageProfitability();

    @GET("/api?method=stats.provider")
    Single<MethodResult<ProviderStat>> getProviderStatistics(@Query("addr") String address);

    @GET("/api?method=stats.provider.ex")
    Single<MethodResult<DetailedProviderStat>> getDetailedProviderStatistics(@Query("addr") String address);

    @GET("/api?method=stats.provider.ex")
    Single<MethodResult<DetailedProviderStat>> getDetailedProviderStatistics(@Query("addr") String address, @Query("from") long timestamp);

    @GET("/api?method=stats.provider.payments")
    Single<MethodResult<Payment>> getPayments(@Query("addr") String address);

    @GET("/api?method=stats.provider.payments")
    Single<MethodResult<Payment>> getPayments(@Query("addr") String address, @Query("from") long timestamp);

    @GET("/api?method=stats.provider.workers")
    Single<MethodResult<WorkerDetails>> getWorkerDetails(@Query("addr") String address);

    @GET("/api?method=stats.provider.workers")
    Single<MethodResult<WorkerDetails>> getWorkerDetails(@Query("addr") String address, @Query("algo") int algo);

    @GET("/api?method=orders.get")
    Single<MethodResult<OrderDetails>> getOrders(@Query("location") int location, @Query("algo") int algo);

    @GET("/api?method=multialgo.info")
    Single<MethodResult<MultiAlgoInfo>> getMultiAlgoInfo();

    @GET("/api?method=simplemultialgo.info")
    Single<MethodResult<SimpleMultiAlgoInfo>> getSimpleMultiAlgoInfo();

    @GET("/api?method=buy.info")
    Single<MethodResult<BuyInfo>> getBuyInfo();
}
