package com.example.jetpackcomponents.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BindingViewModel: ViewModel() {

    val qouteLiveData = MutableLiveData("What you give is what you get")

    fun updateQoute(){
        qouteLiveData.value = "You'll see it when you believe it."
    }
}