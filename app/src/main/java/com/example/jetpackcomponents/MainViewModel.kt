package com.example.jetpackcomponents

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(val initialCounter: Int) : ViewModel() {

    val factsLiveData = MutableLiveData<Int> (initialCounter)

    var count: Int = initialCounter
    fun incrementLiveData(){
        count++
        factsLiveData.value = count
    }

}