package com.chinmay.mvvmexample.data.db.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.chinmay.mvvmexample.data.db.entities.CURRENT_USER_ID
import com.chinmay.mvvmexample.data.db.entities.User

/**
 * Created by grandolf49 on 15-05-2020
 */
@Dao
interface UserDao {

    @Insert(onConflict = REPLACE)
    fun upsert(user: User): Long

    @Query("select * from user where uid = $CURRENT_USER_ID")
    fun getUser(): LiveData<User>

}