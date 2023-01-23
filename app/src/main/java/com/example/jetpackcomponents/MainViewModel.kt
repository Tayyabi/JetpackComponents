package com.example.jetpackcomponents

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(val initialCounter: Counter) : ViewModel() {

    val factsLiveData = MutableLiveData<Counter> (initialCounter)

    var count: Counter = initialCounter
    fun incrementLiveData(){
        count.count++
        factsLiveData.value = count
    }

}