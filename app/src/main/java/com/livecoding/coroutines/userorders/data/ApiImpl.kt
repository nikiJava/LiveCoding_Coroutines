package com.livecoding.coroutines.userorders.data

import android.content.res.Resources
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.livecoding.coroutines.R
import com.livecoding.coroutines.base.assertMainThread
import com.livecoding.coroutines.base.currentThread
import com.livecoding.coroutines.base.fromJson
import kotlinx.coroutines.delay


class ApiImpl(private val resources: Resources) : Api {

    private val gson: Gson = GsonBuilder().create()

    override suspend fun getOrders(): List<OrderRemote> {
        assertMainThread()
        return simulateRequest(logName = "getOrders", delay = 2000) {
            gson.fromJson<List<OrderRemote>>(resources, R.raw.orders_response)
        }
    }

    override suspend fun getUsers(): List<UserRemote> {
        assertMainThread()
        return simulateRequest(logName = "getUser", delay = 3000) {
            gson.fromJson<List<UserRemote>>(resources, R.raw.users_response)
        }
    }

    private suspend fun <T> simulateRequest(logName: String, delay: Long, action: () -> T): T {
        println("$logName started on thread = $currentThread")
        delay(delay)
        val result = action()
        println("$logName finished on thread = $currentThread")
        return result
    }
}
