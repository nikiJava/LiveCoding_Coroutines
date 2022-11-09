package com.livecoding.coroutines.orders

import android.content.Context
import com.livecoding.coroutines.orders.data.MockOrdersApi
import com.livecoding.coroutines.orders.data.OrdersApi

object Dependencies {

    private var _ordersApi: OrdersApi? = null
    val ordersApi
        get() = _ordersApi
            ?: throw IllegalStateException("Dependency _ordersApi was not initialized")

    fun initOrdersApi(context: Context) {
        _ordersApi = MockOrdersApi(context.resources)
    }
}