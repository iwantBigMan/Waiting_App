package com.example.waiting_app.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.waiting_app.R
import com.example.waiting_app.databinding.ActivityWaitingListBinding
import com.example.waiting_app.viewModel.MainViewModel

class WaitingList : AppCompatActivity() {
    private lateinit var binding: ActivityWaitingListBinding
    private val model: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_waiting_list_data)

        binding.lifecycleOwner = this
        binding.viewModel = model
    }
}