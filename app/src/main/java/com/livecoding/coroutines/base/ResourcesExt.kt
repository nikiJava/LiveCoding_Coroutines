package com.livecoding.coroutines.base

import android.content.res.Resources
import androidx.annotation.RawRes

fun Resources.getReader(@RawRes jsonRes: Int) = openRawResource(jsonRes).bufferedReader()