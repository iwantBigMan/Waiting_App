package com.example.waiting_app.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.waiting_app.R
import com.example.waiting_app.databinding.ActivityMainBinding
import com.example.waiting_app.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var mbinding : ActivityMainBinding
    private val model : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mbinding.lifecycleOwner = this
        mbinding.viewModel = model

        var getWaitingNumber = findViewById<Button>(R.id.get_waiting_number)

        getWaitingNumber.setOnClickListener {
            var intent = Intent(this, SetWaitingNumberActivity::class.java)

            startActivity(intent)
            finish()
        }
    }
}