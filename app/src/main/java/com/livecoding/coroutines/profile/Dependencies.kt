package com.livecoding.coroutines.profile

import android.content.Context
import com.livecoding.coroutines.profile.data.MockProfileApi
import com.livecoding.coroutines.profile.data.ProfileApi

object Dependencies {

    private var _userProfileApi: ProfileApi? = null
    val profileApi
        get() = _userProfileApi
            ?: throw IllegalStateException("Dependency _userOrdersApi was not initialized")

    fun initUserOrdersApi(context: Context) {
        _userProfileApi = MockProfileApi(context.resources)
    }
}