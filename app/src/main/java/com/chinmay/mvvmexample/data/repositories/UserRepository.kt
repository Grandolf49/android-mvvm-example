package com.chinmay.mvvmexample.data.repositories

import com.chinmay.mvvmexample.data.network.MyApi
import com.chinmay.mvvmexample.data.network.SafeApiRequest
import com.chinmay.mvvmexample.data.network.responses.AuthResponse

/**
 * Created by grandolf49 on 15-05-2020
 */
class UserRepository : SafeApiRequest() {

    suspend fun userLogin(email: String, password: String): AuthResponse {
        return apiRequest { MyApi().userLogin(email, password) }
    }

}