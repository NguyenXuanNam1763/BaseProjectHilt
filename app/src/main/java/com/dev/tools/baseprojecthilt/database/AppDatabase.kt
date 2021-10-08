package com.dev.tools.baseprojecthilt.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dev.tools.baseprojecthilt.model.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}