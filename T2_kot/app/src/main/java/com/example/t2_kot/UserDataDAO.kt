package com.example.t2_kot

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface UserDataDAO {

    @Query("SELECT * FROM userdataapp")
    fun all(): List<UserDataApp>

    @Query("SELECT * FROM userdataapp WHERE userName == :userName")
    fun getLoginUser(userName: String): List<UserDataApp>

    @Query("SELECT * FROM userdataapp WHERE userPass == :userPass")
    fun getLoginPass(userPass: String): List<UserDataApp>

    @Insert
    fun add(vararg userDatumApps : UserDataApp)
}