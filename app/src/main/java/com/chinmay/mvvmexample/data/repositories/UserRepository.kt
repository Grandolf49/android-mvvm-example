package com.chinmay.mvvmexample.data.repositories

import com.chinmay.mvvmexample.data.network.MyApi
import com.chinmay.mvvmexample.data.network.responses.AuthResponse
import retrofit2.Response

/**
 * Created by grandolf49 on 15-05-2020
 */
class UserRepository {

    suspend fun userLogin(email: String, password: String): Response<AuthResponse> {
        return MyApi().userLogin(email, password)
    }

}