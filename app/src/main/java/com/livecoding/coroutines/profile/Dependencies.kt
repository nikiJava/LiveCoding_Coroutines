package com.livecoding.coroutines.profile

import android.content.Context
import com.livecoding.coroutines.profile.data.MockProfileApi
import com.livecoding.coroutines.profile.data.ProfileApi

object Dependencies {

    private var _profileApi: ProfileApi? = null
    val profileApi
        get() = _profileApi
            ?: throw IllegalStateException("Dependency _profileApi was not initialized")

    fun initProfileApi(context: Context) {
        _profileApi = MockProfileApi(context.resources)
    }
}