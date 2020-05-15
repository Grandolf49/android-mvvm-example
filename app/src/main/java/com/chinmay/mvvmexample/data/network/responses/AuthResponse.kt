package com.chinmay.mvvmexample.data.network.responses

import com.chinmay.mvvmexample.data.db.entities.User

/**
 * Created by grandolf49 on 15-05-2020
 */
data class AuthResponse(
    val isSuccessful: Boolean?,
    val message: String?,
    val user: User?
)