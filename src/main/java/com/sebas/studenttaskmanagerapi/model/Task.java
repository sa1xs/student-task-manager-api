package com.sebas.studenttaskmanagerapi.model;

public class Task {

    // Identificador único de la tarea.
    private Long id;

    // Descripción o título de la tarea.
    private String title;

    // Indica si la tarea ya fue completada.
    private boolean completed;

    // Constructor utilizado para crear objetos Task con sus datos.
    public Task(Long id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    // Devuelve el identificador de la tarea.
    public Long getId() {
        return id;
    }

    // Devuelve el título de la tarea.
    public String getTitle() {
        return title;
    }

    // Devuelve true si la tarea está completada.
    public boolean isCompleted() {
        return completed;
    }
}