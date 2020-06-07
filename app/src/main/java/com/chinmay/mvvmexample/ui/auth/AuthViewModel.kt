package com.chinmay.mvvmexample.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.chinmay.mvvmexample.data.repositories.UserRepository
import com.chinmay.mvvmexample.util.ApiException
import com.chinmay.mvvmexample.util.Coroutines

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

        Coroutines.main {
            try {
                val authResponse = UserRepository().userLogin(email!!, password!!)
                authResponse.user?.let {
                    authListener?.onSuccess(it)
                    return@main
                }
                authListener?.onFailure(authResponse.message!!)
            } catch (e: ApiException) {
                authListener?.onFailure(e.message!!)
            }
        }
    }

    fun onSignUp(view: View) {

    }
}