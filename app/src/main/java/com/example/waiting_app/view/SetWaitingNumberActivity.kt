package com.example.waiting_app.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.waiting_app.ItemClickListener
import com.example.waiting_app.R
import com.example.waiting_app.adapter.ListAdapter
import com.example.waiting_app.databinding.ActivitySetWaitingNumberBinding
import com.example.waiting_app.repository.Database
import com.example.waiting_app.viewModel.MainViewModel

class SetWaitingNumberActivity : AppCompatActivity(), ItemClickListener {
    private lateinit var mbind: ActivitySetWaitingNumberBinding
    private val model: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbind = DataBindingUtil.setContentView(this, R.layout.activity_set_waiting_number)

        mbind.lifecycleOwner = this
        mbind.viewModelWaitingNumber = model

        mbind.apply {
            recyclerView.adapter = ListAdapter(this@SetWaitingNumberActivity)
            lifecycleOwner = this@SetWaitingNumberActivity
            viewModel = MainViewModel
        }
    }

    override fun onClicked(user: Database) {
        Log.d("TEST5", "onClicked: $user")
    }
}
