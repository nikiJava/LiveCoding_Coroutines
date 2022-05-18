package com.livecoding.coroutines.base

import android.content.res.Resources
import androidx.annotation.RawRes
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.Reader

internal inline fun <reified T> Gson.fromJson(jsonReader: Reader) =
    fromJson<T>(jsonReader, object : TypeToken<T>() {}.type)

internal inline fun <reified T> Gson.fromJson(resources: Resources, @RawRes jsonRes: Int) =
    fromJson<T>(resources.getReader(jsonRes), object : TypeToken<T>() {}.type)