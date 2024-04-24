package com.example.sampleappmvi.data.api

import com.example.sampleappmvi.data.model.TodoTask

interface RestApi {

    suspend fun getTodoTasks(): List<TodoTask>
}