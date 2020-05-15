package com.chinmay.mvvmexample.ui.auth

import androidx.lifecycle.LiveData

/**
 * Created by grandolf49 on 01-05-2020
 */
interface AuthListener {
    fun onStarted()

    fun onSuccess(loginResponse: LiveData<String>)

    fun onFailure(message: String)
}