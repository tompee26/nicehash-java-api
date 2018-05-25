package com.tompee.nicehash

import android.os.Bundle
import android.os.StrictMode
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.tompee.nicehash.api.NicehashApiCallback
import com.tompee.nicehash.api.NicehashApiClientFactory
import com.tompee.nicehash.api.model.MethodResult
import com.tompee.nicehash.api.model.buyinfo.BuyInfo


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)

        val clientFactory = NicehashApiClientFactory.createInstance()
        val restClient = clientFactory.createRestClient()
        val asyncClient = clientFactory.createAsyncRestClient()

        asyncClient.getBuyInfo(object : NicehashApiCallback<MethodResult<BuyInfo>> {
            override fun onFailure(cause: Throwable?) {

            }

            override fun onResponse(response: MethodResult<BuyInfo>?) {
                Log.d("Nicehash test", response?.result?.dynamicFee)
            }
        })
    }
}
