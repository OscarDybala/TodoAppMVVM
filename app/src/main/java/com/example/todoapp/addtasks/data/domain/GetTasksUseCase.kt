package com.example.todoapp.addtasks.data.domain

import com.example.todoapp.addtasks.data.TaskRepository
import com.example.todoapp.addtasks.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(private val taskRepository: TaskRepository){
    operator  fun invoke():Flow<List<TaskModel>>{
        return taskRepository.tasks
    }
}