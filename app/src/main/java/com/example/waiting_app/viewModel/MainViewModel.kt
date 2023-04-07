package com.example.waiting_app.viewModel

import android.provider.ContactsContract.Data
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.waiting_app.model.Database

class MainViewModel: ViewModel() {
    // Contacts 데이터
    private val _contacts = MutableLiveData<List<Database>>()
    val contacts: LiveData<List<Database>> = _contacts

    // Contact 데이터 추가
    fun addContact(contact: Database) {
        val currentList = _contacts.value?.toMutableList() ?: mutableListOf()
        currentList.add(contact)
        _contacts.value = currentList
    }
}
