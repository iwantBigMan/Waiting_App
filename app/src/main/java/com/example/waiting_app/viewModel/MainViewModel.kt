package com.example.waiting_app.viewModel

import android.app.Application
import androidx.lifecycle.*
import com.example.waiting_app.repository.Database
import com.example.waiting_app.data.ListDatabase
import com.example.waiting_app.repository.ListRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// 뷰모델은 DB에 직접 접근하지 않아야한다. Repository 에서 데이터 통신.
class MainViewModel(application: Application): AndroidViewModel(application) {
    private val readAllData: LiveData<List<Database>>
    private val repository: ListRepository

    init {
        val listDao = ListDatabase.getDatabase(application)!!.listDao()
        repository = ListRepository(listDao)
        readAllData = repository.readAllData
    }


    fun addUserList(userList : Database){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addUserList(userList)
        }
    }

    // ViewModel에 파라미터를 넘기기 위해서, 파라미터를 포함한 Factory 객체를 생성하기 위한 클래스
    class Factory(val application: Application) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return MainViewModel(application) as T
        }
    }
}





