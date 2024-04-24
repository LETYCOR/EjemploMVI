package com.example.sampleappmvi.data.api

import com.example.sampleappmvi.data.model.TodoTask
import retrofit2.http.GET

interface RestApiService {

    @GET("todos")
    suspend fun listTodo(): List<TodoTask>
    
}