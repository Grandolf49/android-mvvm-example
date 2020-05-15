package com.chinmay.mvvmexample.data.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.chinmay.mvvmexample.data.network.MyApi
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by grandolf49 on 15-05-2020
 */
class UserRepository {

    fun userLogin(email: String, password: String): LiveData<String> {
        val loginResponse = MutableLiveData<String>()

        // Bad practice to create an object of MyApi. This dependency should be injected
        MyApi().userLogin(email, password)
            .enqueue(object : Callback<ResponseBody> {
                override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                    loginResponse.value = t.message
                }

                override fun onResponse(
                    call: Call<ResponseBody>,
                    response: Response<ResponseBody>
                ) {
                    if (response.isSuccessful) {
                        loginResponse.value = response.body()?.string()
                    } else {
                        loginResponse.value = response.errorBody()?.string()
                    }
                }
            })
        return loginResponse
    }

}