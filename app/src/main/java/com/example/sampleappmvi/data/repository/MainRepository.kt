package com.example.sampleappmvi.data.repository

import com.example.sampleappmvi.data.api.RestApi

class MainRepository(private val restApi: RestApi) {

    suspend fun getTodoTasks() = restApi.getTodoTasks()
}