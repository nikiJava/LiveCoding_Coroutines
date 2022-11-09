package com.livecoding.coroutines.orders.data

interface OrdersApi {

    suspend fun getOrders(): List<OrderStub>
}

object OrderStub
