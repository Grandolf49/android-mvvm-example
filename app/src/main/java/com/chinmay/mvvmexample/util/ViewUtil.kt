package com.chinmay.mvvmexample.util

import android.content.Context
import android.widget.Toast

/**
 * Created by grandolf49 on 01-05-2020
 * Using the extension functions in Kotlin
 */
fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}