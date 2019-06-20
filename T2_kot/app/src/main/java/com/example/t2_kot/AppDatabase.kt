package com.example.t2_kot

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = [UserDataApp::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDataDao() : UserDataDAO

}