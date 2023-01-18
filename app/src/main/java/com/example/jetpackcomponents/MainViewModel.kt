package com.example.jetpackcomponents

import androidx.lifecycle.ViewModel

class MainViewModel(val initialCounter: Int) : ViewModel() {

    var count: Int = initialCounter

    fun increment(){
        count++
    }
}