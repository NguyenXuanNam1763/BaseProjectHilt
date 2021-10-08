package com.dev.tools.baseprojecthilt.database

import androidx.room.Insert
import androidx.room.OnConflictStrategy

interface BaseDao<T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertEntityNonRx(entity: T)
}