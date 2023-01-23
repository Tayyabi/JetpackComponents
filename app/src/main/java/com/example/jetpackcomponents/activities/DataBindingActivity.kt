package com.example.jetpackcomponents.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.jetpackcomponents.R
import com.example.jetpackcomponents.databinding.ActivityDataBindingBinding
import com.example.jetpackcomponents.viewmodels.BindingViewModel

class DataBindingActivity : AppCompatActivity() {


    lateinit var binding: ActivityDataBindingBinding
    lateinit var bindingViewModel: BindingViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding)

        bindingViewModel = ViewModelProvider(this).get(BindingViewModel::class.java)

//        mainViewModel.qouteLiveData.observe(this, Observer {
//            binding.qouteText.text = it
//        })


//        binding.btnUpdate.setOnClickListener {
//            bindingViewModel.updateQoute()
//        }

        binding.bindingViewModel = bindingViewModel
        binding.lifecycleOwner = this

    }
}