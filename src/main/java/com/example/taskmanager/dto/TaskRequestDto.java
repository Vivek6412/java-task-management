package com.example.taskmanager.dto;

import com.example.taskmanager.model.TaskStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

public record TaskRequestDto(
        @NotBlank @Size(max = 100) String title,
        @Size(max = 255) String description,
        TaskStatus status,
        LocalDate dueDate
) {}