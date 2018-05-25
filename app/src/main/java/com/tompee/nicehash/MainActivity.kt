package com.tompee.nicehash

import android.os.Bundle
import android.os.StrictMode
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.tompee.nicehash.api.NicehashApiClientFactory


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)

        val clientFactory = NicehashApiClientFactory.createInstance()
        val restClient = clientFactory.createRestClient()

        val globalCurrent = restClient.getProviderStatistics("37MoymjzihcS5x45AfqDJzHUBcqu8gSxCb")
        Log.d("Nicehash test", globalCurrent.result.addr)
    }
}
