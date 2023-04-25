package com.example.todoapp.addtasks.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {
    @Query("select * from TaskEntity")
    fun getTasks(): Flow<List<TaskEntity>>

    @Insert
    suspend fun addTask(item:TaskEntity)

    @Update
    suspend fun updateTask(item: TaskEntity)

    @Delete
    suspend fun deleteTask(item: TaskEntity)


}