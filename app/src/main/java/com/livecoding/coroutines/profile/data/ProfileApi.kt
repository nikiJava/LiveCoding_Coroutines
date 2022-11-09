package com.livecoding.coroutines.profile.data

interface ProfileApi {

    suspend fun getProfile(): List<ProfileStub>
}

object ProfileStub
