package com.livecoding.coroutines.userorders.data

import android.content.res.Resources
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.livecoding.coroutines.R
import com.livecoding.coroutines.base.assertMainThread
import com.livecoding.coroutines.base.currentThread
import com.livecoding.coroutines.base.fromJson
import kotlinx.coroutines.delay

/**
 * Предположим, что эта та самая прокси-сущность, которую в рантайме генерирует Retrofit 2.
 */
class MockUserOrdersApi(private val resources: Resources) : UserOrdersApi {

    private val gson: Gson = GsonBuilder().create()

    override suspend fun getOrders(): List<OrderStub> {
        assertMainThread()
        return simulateRequest(logName = "getOrders", delay = 2000) {
            gson.fromJson<List<OrderStub>>(resources, R.raw.orders_response)
        }
    }

    override suspend fun getUsers(): List<UserStub> {
        assertMainThread()
        return simulateRequest(logName = "getUser", delay = 3000) {
            gson.fromJson<List<UserStub>>(resources, R.raw.users_response)
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
