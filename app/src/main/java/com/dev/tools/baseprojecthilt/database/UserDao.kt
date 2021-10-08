package com.dev.tools.baseprojecthilt.database

import androidx.room.Dao
import com.dev.tools.baseprojecthilt.model.User

@Dao
interface UserDao : BaseDao<User> {

}