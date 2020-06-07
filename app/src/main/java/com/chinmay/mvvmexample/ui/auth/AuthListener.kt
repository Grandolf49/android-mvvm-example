package com.chinmay.mvvmexample.ui.auth

import com.chinmay.mvvmexample.data.db.entities.User

/**
 * Created by grandolf49 on 01-05-2020
 */
interface AuthListener {

    fun onStarted()

    fun onSuccess(user: User)

    fun onFailure(message: String)
}