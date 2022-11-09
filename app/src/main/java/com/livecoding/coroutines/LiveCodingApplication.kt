package com.livecoding.coroutines

import android.app.Application
import com.livecoding.coroutines.orders.Dependencies

class LiveCodingApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Dependencies.initOrdersApi(this)
    }
}