package com.example.jetpackcomponents.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.jetpackcomponents.models.Counter

class MainViewModel(val initialCounter: Counter) : ViewModel() {

    val factsLiveData = MutableLiveData<Counter> (initialCounter)

    var count: Counter = initialCounter
    fun incrementLiveData(){
        count.count++
        factsLiveData.value = count
    }

}