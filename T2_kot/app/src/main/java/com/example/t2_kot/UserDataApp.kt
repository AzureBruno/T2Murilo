package com.example.t2_kot

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class UserDataApp(
     val userName : String,
     val userPass : String,
    @PrimaryKey(autoGenerate = true)
    private val id : Long = 0)