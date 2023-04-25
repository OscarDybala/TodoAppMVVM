package com.example.todoapp.addtasks.ui

import com.example.todoapp.addtasks.ui.model.TaskModel
import java.util.TimerTask

sealed interface TasksUiState {
    object Loading:TasksUiState
    data class Error(val throwable: Throwable):TasksUiState
    data class Success(val tasks:List<TaskModel> ):TasksUiState
}