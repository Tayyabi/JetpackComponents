package com.example.jetpackcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    companion object{
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: Activity")
        lifecycle.addObserver(MainActivityObserver())

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