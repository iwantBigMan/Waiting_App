package com.example.waiting_app.viewModel

import androidx.lifecycle.ViewModel
import com.example.waiting_app.model.Database

class MainViewModel: ViewModel() {
    private val database : Database = Database()
}