package com.example.waiting_app.repository

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "userList_table")

data class Database(
    // autoGenerate = true , 자동으로 PrimaryKey 생성해줌
    @PrimaryKey(autoGenerate = true)
    var name: String, var phoneNumber: String)

