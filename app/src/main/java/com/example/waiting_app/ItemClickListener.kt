package com.example.waiting_app

import com.example.waiting_app.repository.Database

interface ItemClickListener {
    fun onClicked(userList: Database)
}