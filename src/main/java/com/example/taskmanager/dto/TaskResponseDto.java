package com.example.taskmanager.dto;

import com.example.taskmanager.model.TaskStatus;
import java.time.LocalDate;

public record TaskResponseDto(
        Long id,
        String title,
        String description,
        TaskStatus status,
        LocalDate dueDate
) {}