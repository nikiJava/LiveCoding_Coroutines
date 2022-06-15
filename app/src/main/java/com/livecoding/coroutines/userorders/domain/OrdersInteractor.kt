package com.livecoding.coroutines.userorders.domain

import com.livecoding.coroutines.userorders.data.OrdersRepository

class OrdersInteractor(private val mapper: OrdersMapper, private val repository: OrdersRepository) {

    suspend fun fetchOrders() {

        repository.fetchOrders()
    }
}