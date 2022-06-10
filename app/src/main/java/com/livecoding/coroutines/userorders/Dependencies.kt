package com.livecoding.coroutines.userorders

import android.content.Context
import com.livecoding.coroutines.userorders.data.MockUserOrdersApi
import com.livecoding.coroutines.userorders.data.UserOrdersApi

object Dependencies {

    private var _userOrdersApi: UserOrdersApi? = null
    val userOrdersApi
        get() = _userOrdersApi
            ?: throw IllegalStateException("Dependency _userOrdersApi was not initialized")

    fun initUserOrdersApi(context: Context) {
        _userOrdersApi = MockUserOrdersApi(context.resources)
    }
}