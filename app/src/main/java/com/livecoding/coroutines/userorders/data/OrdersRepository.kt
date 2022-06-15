package com.livecoding.coroutines.userorders.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class OrdersRepository(private val ordersApi: Api) {

    suspend fun fetchOrders() {
        withContext(Dispatchers.IO) {
            ordersApi.getOrders()
        }
    }
}