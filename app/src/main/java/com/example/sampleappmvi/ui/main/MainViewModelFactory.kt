package com.example.sampleappmvi.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.sampleappmvi.data.api.RestApi
import com.example.sampleappmvi.data.repository.MainRepository

class MainViewModelFactory(private val restApi: RestApi) : ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainActivityViewModel::class.java))
            return MainActivityViewModel(MainRepository(restApi)) as T

        throw IllegalArgumentException("Unknown class name")
    }
}