package com.chinmay.mvvmexample.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.chinmay.mvvmexample.data.repositories.UserRepository

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

        // Bad practice to create an object of UserRepository. This dependency should be injected
        val loginResponse = UserRepository().userLogin(email!!, password!!)
        authListener?.onSuccess(loginResponse)
    }

    fun onSignUp(view: View) {

    }
}