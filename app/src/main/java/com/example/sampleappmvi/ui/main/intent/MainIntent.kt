package com.example.sampleappmvi.ui.main.intent

sealed class MainIntent {

    object FetchTodoTasks: MainIntent()
}