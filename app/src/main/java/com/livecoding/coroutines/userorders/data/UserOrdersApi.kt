package com.livecoding.coroutines.userorders.data

interface UserOrdersApi {

    suspend fun getOrders(): List<OrderStub>

    suspend fun getUsers(): List<UserStub>
}

object OrderStub
object UserStub
