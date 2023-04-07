package com.example.waiting_app.model

import java.util.LinkedList
import java.util.Queue

class Database {
    private lateinit var database: Database
    private var waitingNumberList : Queue<Int> = LinkedList()
    private var waitingNameList : Queue<String> = LinkedList()


    fun saveNumber(number: Int) {
        waitingNumberList.add(number)
    }

    fun saveName(name: String){
        waitingNameList.offer(name)

    }

    fun getAllName() : Queue<String> {
        return waitingNameList
    }

    fun getAllNumber() : Queue<Int> {
        return waitingNumberList
    }

    fun removeWaitingList(){
        waitingNumberList.clear()
        waitingNameList.clear()
    }
}