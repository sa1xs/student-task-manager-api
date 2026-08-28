package com.sebas.studenttaskmanagerapi.dto;

import jakarta.validation.constraints.NotBlank;

public class CreateTaskRequest {

    // El título es obligatorio y no puede contener solamente espacios.
    @NotBlank(message = "Title is required")
    private String title;

    // Jackson necesita este constructor para crear el objeto desde el JSON.
    public CreateTaskRequest() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}