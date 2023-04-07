package com.example.waiting_app.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.waiting_app.R
import com.example.waiting_app.databinding.ActivityMainBinding
import com.example.waiting_app.databinding.ActivitySetWaitingNumberBinding
import com.example.waiting_app.viewModel.MainViewModel

class SetWaitingNumberActivity : AppCompatActivity() {
    private lateinit var mbind: ActivitySetWaitingNumberBinding
    private val model: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbind = DataBindingUtil.setContentView(this, R.layout.activity_set_waiting_number)

        mbind.lifecycleOwner = this
        mbind.viewModelWaitingNumber = model

    }
}