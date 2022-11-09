package com.livecoding.coroutines

import android.app.Application
import com.livecoding.coroutines.profile.Dependencies

class LiveCodingApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Dependencies.initUserOrdersApi(this)
    }
}