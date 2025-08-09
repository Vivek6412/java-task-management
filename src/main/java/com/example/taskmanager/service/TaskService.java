package com.example.taskmanager.service;

import com.example.taskmanager.dto.TaskRequestDto;
import com.example.taskmanager.dto.TaskResponseDto;
import com.example.taskmanager.model.TaskStatus;
import java.util.List;

public interface TaskService {
    TaskResponseDto createTask(TaskRequestDto requestDto);
    List<TaskResponseDto> getAllTasks();
    TaskResponseDto getTaskById(Long id);
    TaskResponseDto updateTask(Long id, TaskRequestDto requestDto);
    void deleteTask(Long id);
    TaskResponseDto updateTaskStatus(Long id, TaskStatus status);
}