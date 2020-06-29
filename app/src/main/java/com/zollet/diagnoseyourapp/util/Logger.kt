package com.zollet.diagnoseyourapp.util

import android.util.Log
import com.zollet.diagnoseyourapp.BuildConfig

object Logger {

    fun v(tag: String, msg: String) {
        if (BuildConfig.DEBUG)
            Log.v(tag, msg)
    }

    fun v(tag: String, msg: String, e: Throwable) {
        if (BuildConfig.DEBUG) Log.v(tag, msg, e)
    }

    fun d(tag: String, msg: String) {
        if (BuildConfig.DEBUG) Log.d(tag, msg)
    }

    fun d(tag: String, msg: String, e: Throwable) {
        if (BuildConfig.DEBUG) Log.d(tag, msg, e)
    }

    fun w(tag: String, msg: String) {
        if (BuildConfig.DEBUG) Log.w(tag, msg)
    }

    fun w(tag: String, msg: String, e: Throwable) {
        if (BuildConfig.DEBUG) Log.w(tag, msg, e)
    }

    fun i(tag: String, msg: String) {
        if (BuildConfig.DEBUG) Log.i(tag, msg)
    }

    fun i(tag: String, msg: String, e: Throwable) {
        if (BuildConfig.DEBUG) Log.i(tag, msg, e)
    }

    fun e(tag: String, msg: String) {
        if (BuildConfig.DEBUG) Log.e(tag, msg)
    }

    fun e(tag: String, msg: String, e: Throwable) {
        if (BuildConfig.DEBUG) Log.e(tag, msg, e)
    }
}
