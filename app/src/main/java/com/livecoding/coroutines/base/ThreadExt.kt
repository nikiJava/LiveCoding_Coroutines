package com.livecoding.coroutines.base

import android.os.Looper

val currentThread: String get() = Thread.currentThread().name

fun assertMainThread() {
    if (Looper.getMainLooper().isCurrentThread) {
        throw RuntimeException("Нельзя делать запросы на главном потоке")
    }
}
