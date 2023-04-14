package com.example.waiting_app.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.waiting_app.repository.Database

@Dao
interface ListDao {
    // OnConflictStrategy.IGNORE = 동일한 아이디가 있을 시 무시
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUserList(userList : Database)

    @Query("SELECT * FROM userList_table ORDER BY id ASC")
    fun readAllData() : LiveData<List<Database>>

}
