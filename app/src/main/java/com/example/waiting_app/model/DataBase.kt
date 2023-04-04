package com.example.waiting_app.model

class Database {
    private lateinit var database: Database
    private var arrayList : ArrayList<Int> = ArrayList()

    fun saveNumber(number: Int) {
        arrayList.add(number)
    }

    fun getAllNumber() : ArrayList<Int> {
        return arrayList
    }

    fun removeNumber(){
        arrayList.clear()
    }
}