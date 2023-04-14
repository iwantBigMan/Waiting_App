package com.example.waiting_app.repository

import androidx.lifecycle.LiveData
import com.example.waiting_app.data.ListDao

class ListRepository(private val listDao: ListDao){
    val readAllData : LiveData<List<Database>> = listDao.readAllData()
    suspend fun addUserList(userList: Database){
        listDao.addUserList(userList)
    }

}

