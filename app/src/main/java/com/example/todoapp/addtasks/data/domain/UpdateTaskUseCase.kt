package com.example.todoapp.addtasks.data.domain

import com.example.todoapp.addtasks.data.TaskRepository
import com.example.todoapp.addtasks.ui.model.TaskModel
import javax.inject.Inject

class UpdateTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    suspend operator fun invoke (taskModel: TaskModel){
        taskRepository.update(taskModel)
    }
}