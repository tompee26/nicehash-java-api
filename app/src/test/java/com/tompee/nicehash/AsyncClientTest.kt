package com.tompee.nicehash

import com.tompee.nicehash.api.NicehashApiCallback
import com.tompee.nicehash.api.NicehashApiClientFactory
import com.tompee.nicehash.api.model.MethodResult
import com.tompee.nicehash.api.model.NicehashApiAlgorithm
import com.tompee.nicehash.api.model.NicehashApiLocation
import com.tompee.nicehash.api.model.SimpleMultiAlgoInfo
import com.tompee.nicehash.api.model.average.GlobalAverage
import com.tompee.nicehash.api.model.buyinfo.BuyInfo
import com.tompee.nicehash.api.model.detailedproviderstat.DetailedProviderStat
import com.tompee.nicehash.api.model.global.GlobalCurrent
import com.tompee.nicehash.api.model.multialgo.MultiAlgoInfo
import com.tompee.nicehash.api.model.order.OrderDetails
import com.tompee.nicehash.api.model.payments.Payment
import com.tompee.nicehash.api.model.providerstat.ProviderStat
import com.tompee.nicehash.api.model.version.Version
import com.tompee.nicehash.api.model.worker.WorkerDetails
import org.junit.Test
import java.util.concurrent.CountDownLatch

class AsyncClientTest {

    private val address = "37MoymjzihcS5x45AfqDJzHUBcqu8gSxCb"
    private val timestamp = 1527470747L

    @Test
    fun testVersion() {
        val factory = NicehashApiClientFactory.createInstance()
        val asyncClient = factory.createAsyncRestClient()
        val latch = CountDownLatch(1)

        var version: MethodResult<Version>? = null
        asyncClient.getVersion(object : NicehashApiCallback<MethodResult<Version>> {
            override fun onResponse(response: MethodResult<Version>?) {
                version = response
                latch.countDown()
            }

            override fun onFailure(cause: Throwable?) {
                latch.countDown()
            }
        })
        latch.await()
        assert(version != null)
        assert(version?.method == null)
        assert(version?.result != null)
        assert(version?.result?.error == null)
        assert(version?.result?.apiVersion == "1.2.7")
    }

    @Test
    fun testGlobalProfitability() {
        val factory = NicehashApiClientFactory.createInstance()
        val asyncClient = factory.createAsyncRestClient()
        var latch = CountDownLatch(1)

        var globalProfitability: MethodResult<GlobalCurrent>? = null
        asyncClient.getCurrentGlobalProfitability(object : NicehashApiCallback<MethodResult<GlobalCurrent>> {
            override fun onResponse(response: MethodResult<GlobalCurrent>?) {
                globalProfitability = response
                latch.countDown()
            }

            override fun onFailure(cause: Throwable?) {
                latch.countDown()
            }
        })
        latch.await()
        assert(globalProfitability != null)
        assert(globalProfitability?.method == "stats.global.current")
        assert(globalProfitability?.result != null)
        assert(globalProfitability?.result?.error == null)

        latch = CountDownLatch(1)
        globalProfitability = null
        asyncClient.getCurrentGlobalProfitability(NicehashApiLocation.USA, object : NicehashApiCallback<MethodResult<GlobalCurrent>> {
            override fun onResponse(response: MethodResult<GlobalCurrent>?) {
                globalProfitability = response
                latch.countDown()
            }

            override fun onFailure(cause: Throwable?) {
                latch.countDown()
            }
        })
        latch.await()
        assert(globalProfitability != null)
        assert(globalProfitability?.method == "stats.global.current")
        assert(globalProfitability?.result != null)
        assert(globalProfitability?.result?.error == null)

        latch = CountDownLatch(1)
        globalProfitability = null
        asyncClient.getCurrentGlobalProfitability(NicehashApiLocation.Europe, object : NicehashApiCallback<MethodResult<GlobalCurrent>> {
            override fun onResponse(response: MethodResult<GlobalCurrent>?) {
                globalProfitability = response
                latch.countDown()
            }

            override fun onFailure(cause: Throwable?) {
                latch.countDown()
            }
        })
        latch.await()
        assert(globalProfitability != null)
        assert(globalProfitability?.method == "stats.global.current")
        assert(globalProfitability?.result != null)
        assert(globalProfitability?.result?.error == null)
    }

    @Test
    fun testAverageGlobalProfitability() {
        val factory = NicehashApiClientFactory.createInstance()
        val asyncClient = factory.createAsyncRestClient()
        val latch = CountDownLatch(1)

        var globalAverage: MethodResult<GlobalAverage>? = null
        asyncClient.getAverageGlobalProfitability(object : NicehashApiCallback<MethodResult<GlobalAverage>> {
            override fun onResponse(response: MethodResult<GlobalAverage>?) {
                globalAverage = response
                latch.countDown()
            }

            override fun onFailure(cause: Throwable?) {
                latch.countDown()
            }
        })
        latch.await()
        assert(globalAverage != null)
        assert(globalAverage?.method == "stats.global.24h")
        assert(globalAverage?.result != null)
        assert(globalAverage?.result?.error == null)
    }

    @Test
    fun testProviderStatistics() {
        val factory = NicehashApiClientFactory.createInstance()
        val asyncClient = factory.createAsyncRestClient()
        val latch = CountDownLatch(1)

        var providerStats: MethodResult<ProviderStat>? = null
        asyncClient.getProviderStatistics(address, object : NicehashApiCallback<MethodResult<ProviderStat>> {
            override fun onResponse(response: MethodResult<ProviderStat>?) {
                providerStats = response
                latch.countDown()
            }

            override fun onFailure(cause: Throwable?) {
                latch.countDown()
            }
        })
        latch.await()
        assert(providerStats != null)
        assert(providerStats?.method == "stats.provider")
        assert(providerStats?.result != null)
        assert(providerStats?.result?.error == null)
    }

    @Test
    fun testDetailedProviderStatistics() {
        val factory = NicehashApiClientFactory.createInstance()
        val asyncClient = factory.createAsyncRestClient()
        var latch = CountDownLatch(1)

        var detailedProviderStats: MethodResult<DetailedProviderStat>? = null
        asyncClient.getDetailedProviderStatistics(address, object : NicehashApiCallback<MethodResult<DetailedProviderStat>> {
            override fun onResponse(response: MethodResult<DetailedProviderStat>?) {
                detailedProviderStats = response
                latch.countDown()
            }

            override fun onFailure(cause: Throwable?) {
                latch.countDown()
            }
        })
        latch.await()
        assert(detailedProviderStats != null)
        assert(detailedProviderStats?.method == "stats.provider.ex")
        assert(detailedProviderStats?.result != null)
        assert(detailedProviderStats?.result?.error == null)

        latch = CountDownLatch(1)

        detailedProviderStats = null
        asyncClient.getDetailedProviderStatistics(address, timestamp, object : NicehashApiCallback<MethodResult<DetailedProviderStat>> {
            override fun onResponse(response: MethodResult<DetailedProviderStat>?) {
                detailedProviderStats = response
                latch.countDown()
            }

            override fun onFailure(cause: Throwable?) {
                latch.countDown()
            }
        })
        latch.await()
        assert(detailedProviderStats != null)
        assert(detailedProviderStats?.method == "stats.provider.ex")
        assert(detailedProviderStats?.result != null)
        assert(detailedProviderStats?.result?.error == null)
    }

    @Test
    fun testPayments() {
        val factory = NicehashApiClientFactory.createInstance()
        val asyncClient = factory.createAsyncRestClient()
        var latch = CountDownLatch(1)

        var payments: MethodResult<Payment>? = null
        asyncClient.getPayments(address, object : NicehashApiCallback<MethodResult<Payment>> {
            override fun onResponse(response: MethodResult<Payment>?) {
                payments = response
                latch.countDown()
            }

            override fun onFailure(cause: Throwable?) {
                latch.countDown()
            }
        })
        latch.await()
        assert(payments != null)
        assert(payments?.method == "stats.provider.payments")
        assert(payments?.result != null)
        assert(payments?.result?.error == null)

        latch = CountDownLatch(1)

        payments = null
        asyncClient.getPayments(address, timestamp, object : NicehashApiCallback<MethodResult<Payment>> {
            override fun onResponse(response: MethodResult<Payment>?) {
                payments = response
                latch.countDown()
            }

            override fun onFailure(cause: Throwable?) {
                latch.countDown()
            }
        })
        latch.await()
        assert(payments != null)
        assert(payments?.method == "stats.provider.payments")
        assert(payments?.result != null)
        assert(payments?.result?.error == null)
    }

    @Test
    fun testWorkerDetails() {
        val factory = NicehashApiClientFactory.createInstance()
        val asyncClient = factory.createAsyncRestClient()
        var latch = CountDownLatch(1)

        var workerDetails: MethodResult<WorkerDetails>? = null
        asyncClient.getWorkerDetails(address, object : NicehashApiCallback<MethodResult<WorkerDetails>> {
            override fun onResponse(response: MethodResult<WorkerDetails>?) {
                workerDetails = response
                latch.countDown()
            }

            override fun onFailure(cause: Throwable?) {
                latch.countDown()
            }
        })
        latch.await()
        assert(workerDetails != null)
        assert(workerDetails?.method == "stats.provider.workers")
        assert(workerDetails?.result != null)
        assert(workerDetails?.result?.error == null)

        latch = CountDownLatch(1)

        workerDetails = null
        asyncClient.getWorkerDetails(address, NicehashApiAlgorithm.Lyra2REv2, object : NicehashApiCallback<MethodResult<WorkerDetails>> {
            override fun onResponse(response: MethodResult<WorkerDetails>?) {
                workerDetails = response
                latch.countDown()
            }

            override fun onFailure(cause: Throwable?) {
                latch.countDown()
            }
        })
        latch.await()
        assert(workerDetails != null)
        assert(workerDetails?.method == "stats.provider.workers")
        assert(workerDetails?.result != null)
        assert(workerDetails?.result?.error == null)

    }

    @Test
    fun testOrderDetails() {
        val factory = NicehashApiClientFactory.createInstance()
        val asyncClient = factory.createAsyncRestClient()
        val latch = CountDownLatch(1)

        var orderDetails: MethodResult<OrderDetails>? = null
        asyncClient.getOrderDetails(NicehashApiLocation.USA, NicehashApiAlgorithm.Lyra2REv2, object : NicehashApiCallback<MethodResult<OrderDetails>> {
            override fun onResponse(response: MethodResult<OrderDetails>?) {
                orderDetails = response
                latch.countDown()
            }

            override fun onFailure(cause: Throwable?) {
                latch.countDown()
            }
        })
        latch.await()
        assert(orderDetails != null)
        assert(orderDetails?.method == "orders.get")
        assert(orderDetails?.result != null)
        assert(orderDetails?.result?.error == null)
    }

    @Test
    fun testMultiAlgoInfo() {
        val factory = NicehashApiClientFactory.createInstance()
        val asyncClient = factory.createAsyncRestClient()
        val latch = CountDownLatch(1)

        var multiAlgoInfo: MethodResult<MultiAlgoInfo>? = null
        asyncClient.getMultiAlgoInfo(object : NicehashApiCallback<MethodResult<MultiAlgoInfo>> {
            override fun onResponse(response: MethodResult<MultiAlgoInfo>?) {
                multiAlgoInfo = response
                latch.countDown()
            }

            override fun onFailure(cause: Throwable?) {
                latch.countDown()
            }
        })
        latch.await()
        assert(multiAlgoInfo != null)
        assert(multiAlgoInfo?.method == "multialgo.info")
        assert(multiAlgoInfo?.result != null)
        assert(multiAlgoInfo?.result?.error == null)
    }

    @Test
    fun testSimpleMultiAlgoInfo() {
        val factory = NicehashApiClientFactory.createInstance()
        val asyncClient = factory.createAsyncRestClient()
        val latch = CountDownLatch(1)

        var simpleMultiAlgoInfo: MethodResult<SimpleMultiAlgoInfo>? = null
        asyncClient.getSimpleMultiAlgoInfo(object : NicehashApiCallback<MethodResult<SimpleMultiAlgoInfo>> {
            override fun onResponse(response: MethodResult<SimpleMultiAlgoInfo>?) {
                simpleMultiAlgoInfo = response
                latch.countDown()
            }

            override fun onFailure(cause: Throwable?) {
                latch.countDown()
            }
        })
        latch.await()
        assert(simpleMultiAlgoInfo != null)
        assert(simpleMultiAlgoInfo?.method == "simplemultialgo.info")
        assert(simpleMultiAlgoInfo?.result != null)
        assert(simpleMultiAlgoInfo?.result?.error == null)
    }

    @Test
    fun testBuyInfo() {
        val factory = NicehashApiClientFactory.createInstance()
        val asyncClient = factory.createAsyncRestClient()
        val latch = CountDownLatch(1)

        var buyInfo: MethodResult<BuyInfo>? = null
        asyncClient.getBuyInfo(object : NicehashApiCallback<MethodResult<BuyInfo>> {
            override fun onResponse(response: MethodResult<BuyInfo>?) {
                buyInfo = response
                latch.countDown()
            }

            override fun onFailure(cause: Throwable?) {
                latch.countDown()
            }
        })
        latch.await()
        assert(buyInfo != null)
        assert(buyInfo?.method == "buy.info")
        assert(buyInfo?.result != null)
        assert(buyInfo?.result?.error == null)
    }
}
