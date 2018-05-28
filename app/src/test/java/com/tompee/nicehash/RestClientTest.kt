package com.tompee.nicehash

import com.tompee.nicehash.api.NicehashApiClientFactory
import com.tompee.nicehash.api.model.NicehashApiAlgorithm
import com.tompee.nicehash.api.model.NicehashApiLocation
import org.junit.Test

class RestClientTest {

    private val address = "37MoymjzihcS5x45AfqDJzHUBcqu8gSxCb"
    private val timestamp = 1527470747L

    @Test
    fun testVersion() {
        val factory = NicehashApiClientFactory.createInstance()
        val restClient = factory.createRestClient()
        val version = restClient.version

        assert(version.method == null)
        assert(version.result.error == null)
        assert(version.result.apiVersion == "1.2.7")
    }

    @Test
    fun testGlobalProfitability() {
        val factory = NicehashApiClientFactory.createInstance()
        val restClient = factory.createRestClient()

        var globalProfitability = restClient.currentGlobalProfitability
        assert(globalProfitability.method == "stats.global.current")
        assert(globalProfitability.result.error == null)

        globalProfitability = restClient.getCurrentGlobalProfitability(NicehashApiLocation.USA)
        assert(globalProfitability.method == "stats.global.current")
        assert(globalProfitability.result.error == null)

        globalProfitability = restClient.getCurrentGlobalProfitability(NicehashApiLocation.Europe)
        assert(globalProfitability.method == "stats.global.current")
        assert(globalProfitability.result.error == null)
    }

    @Test
    fun testAverageGlobalProfitability() {
        val factory = NicehashApiClientFactory.createInstance()
        val restClient = factory.createRestClient()
        val globalAverage = restClient.averageGlobalProfitability

        assert(globalAverage.method == "stats.global.24h")
        assert(globalAverage.result.error == null)
    }

    @Test
    fun testProviderStatistics() {
        val factory = NicehashApiClientFactory.createInstance()
        val restClient = factory.createRestClient()
        val providerStats = restClient.getProviderStatistics(address)

        assert(providerStats.method == "stats.provider")
        assert(providerStats.result.error == null)
    }

    @Test
    fun testDetailedProviderStatistics() {
        val factory = NicehashApiClientFactory.createInstance()
        val restClient = factory.createRestClient()

        var detailedProviderStats = restClient.getDetailedProviderStatistics(address)
        assert(detailedProviderStats.method == "stats.provider.ex")
        assert(detailedProviderStats.result.error == null)

        detailedProviderStats = restClient.getDetailedProviderStatistics(address, timestamp)
        assert(detailedProviderStats.method == "stats.provider.ex")
        assert(detailedProviderStats.result.error == null)
    }

    @Test
    fun testPayments() {
        val factory = NicehashApiClientFactory.createInstance()
        val restClient = factory.createRestClient()

        var payments = restClient.getPayments(address)
        assert(payments.method == "stats.provider.payments")
        assert(payments.result.error == null)

        payments = restClient.getPayments(address, timestamp)
        assert(payments.method == "stats.provider.payments")
        assert(payments.result.error == null)
    }

    @Test
    fun testWorkerDetails() {
        val factory = NicehashApiClientFactory.createInstance()
        val restClient = factory.createRestClient()

        var workerDetails = restClient.getWorkerDetails(address)
        assert(workerDetails.method == "stats.provider.workers")
        assert(workerDetails.result.error == null)

        workerDetails = restClient.getWorkerDetails(address, NicehashApiAlgorithm.Lyra2REv2)
        assert(workerDetails.method == "stats.provider.workers")
        assert(workerDetails.result.error == null)
    }

    @Test
    fun testOrderDetails() {
        val factory = NicehashApiClientFactory.createInstance()
        val restClient = factory.createRestClient()
        val orderDetails = restClient.getOrderDetails(NicehashApiLocation.USA, NicehashApiAlgorithm.Lyra2REv2)

        assert(orderDetails.method == "orders.get")
        assert(orderDetails.result.error == null)
    }

    @Test
    fun testMultiAlgoInfo() {
        val factory = NicehashApiClientFactory.createInstance()
        val restClient = factory.createRestClient()
        val multiAlgoInfo = restClient.multiAlgoInfo

        assert(multiAlgoInfo.method == "multialgo.info")
        assert(multiAlgoInfo.result.error == null)
    }

    @Test
    fun testSimpleMultiAlgoInfo() {
        val factory = NicehashApiClientFactory.createInstance()
        val restClient = factory.createRestClient()
        val simpleMultiAlgoInfo = restClient.simpleMultiAlgoInfo

        assert(simpleMultiAlgoInfo.method == "simplemultialgo.info")
        assert(simpleMultiAlgoInfo.result.error == null)
    }

    @Test
    fun testBuyInfo() {
        val factory = NicehashApiClientFactory.createInstance()
        val restClient = factory.createRestClient()
        val buyInfo = restClient.buyInfo

        assert(buyInfo.method == "buy.info")
        assert(buyInfo.result.error == null)
    }
}
