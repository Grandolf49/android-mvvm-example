package com.chinmay.mvvmexample.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

/**
 * Created by grandolf49 on 01-05-2020
 */
class AuthViewModel : ViewModel() {

    var email: String? = null
    var password: String? = null
    var authListener: AuthListener? = null

    fun onLoginButtonClick(view: View) {
        authListener?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListener?.onFailure("Invalid email or password")
            return
        }
        authListener?.onSuccess()
    }

    fun onSignUp(view: View) {

    }
}