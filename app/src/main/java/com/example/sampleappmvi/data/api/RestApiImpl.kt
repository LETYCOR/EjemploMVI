package com.example.sampleappmvi.data.api

import com.example.sampleappmvi.data.model.TodoTask

class RestApiImpl(private val restApiService: RestApiService): RestApi {

    override suspend fun getTodoTasks(): List<TodoTask> {
        return restApiService.listTodo()
    }
}