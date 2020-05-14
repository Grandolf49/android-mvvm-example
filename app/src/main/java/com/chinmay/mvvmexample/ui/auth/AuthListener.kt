package com.chinmay.mvvmexample.ui.auth

/**
 * Created by grandolf49 on 01-05-2020
 */
interface AuthListener {
    fun onStarted()

    fun onSuccess()

    fun onFailure(message: String)
}