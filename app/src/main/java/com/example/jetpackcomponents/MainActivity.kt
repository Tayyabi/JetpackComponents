package com.example.jetpackcomponents

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {


    lateinit var txtCounter: TextView
    lateinit var mainViewModel: MainViewModel
    companion object{
        private const val TAG = "MainActivity"
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtCounter = findViewById(R.id.txtCounter)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        Log.d(TAG, "onCreate: Activity")
        lifecycle.addObserver(MainActivityObserver())

        txtCounter.setOnClickListener{
            mainViewModel.increment()
            txtCounter.text = mainViewModel.count.toString()
        }

    }



    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: Activity")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: Activity")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: Activity")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: Activity")
    }

}