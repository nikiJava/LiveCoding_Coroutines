package com.livecoding.coroutines.userorders.data

interface UserOrdersApi {

    suspend fun getOrders(): List<OrderRemote>

    suspend fun getUsers(): List<UserRemote>
}

/**
 * Итоговые распарсенные модели, которые возвращает [UserOrdersApi] (предположим, что Api - это интерфейс
 * для Retrofit 2, а парсинг Json выполняет Gson).
 */
class OrderRemote(
    val id: Long,
    val userId: Long,
    val price: Long,
    val address: Long
)

class UserRemote(
    val id: Long,
    val name: String
)
