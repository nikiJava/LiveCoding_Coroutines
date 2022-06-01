package com.livecoding.coroutines.userorders.data

import android.content.res.Resources

interface Api {

    companion object {
        fun create(resources: Resources): Api = ApiImpl(resources)
    }

    suspend fun getOrders(): List<OrderRemote>

    suspend fun getUsers(): List<UserRemote>
}

/**
 * Итоговые распарсенные модели, которые возвращает [Api] (предположим, что Api - это интерфейс
 * для Retrofit 2, а парсинг Json выполняет Gson).
 */
class OrderRemote(
    val id: Long,
    val userId: Long,
    val price: Long,
    val orderDate: Long
)

class UserRemote(
    val id: Long,
    val name: String
)
