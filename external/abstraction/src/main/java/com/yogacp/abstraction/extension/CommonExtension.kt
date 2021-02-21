package com.yogacp.abstraction.extension

import com.yogacp.abstraction.BuildConfig

/**
 * Created by Yoga C. Pranata on 2/21/21.
 * Android Engineer
 */
fun debugMode(function: () -> Unit) {
    if(BuildConfig.DEBUG) {
        function()
    }
}

fun releaseMode(function: () -> Unit) {
    if(BuildConfig.BUILD_TYPE.equals("release", ignoreCase = true)) {
        function()
    }
}

inline fun <T : Any> T?.notNull(f: (it: T) -> Unit) {
    if(this != null) f(this)
}

inline fun String?.notNullOrEmpty(f: (it: String) -> Unit): String? {
    return if(this != null && this.trim().isNotEmpty()) {
        f(this)
        this
    } else null
}