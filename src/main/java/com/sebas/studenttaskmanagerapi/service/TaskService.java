package com.sebas.studenttaskmanagerapi.service;

import com.sebas.studenttaskmanagerapi.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    // Almacenamiento temporal de las tareas mientras la aplicación esté encendida.
    private final List<Task> tasks = new ArrayList<>();

    // Próximo identificador disponible para una tarea nueva.
    private long nextId = 2L;

    public TaskService() {
        // Agrega una tarea inicial para poder probar el endpoint.
        tasks.add(new Task(
                1L,
                "Aprender Spring Boot",
                false
        ));
    }

    public List<Task> getAllTasks() {
        // Devuelve una copia para evitar que otras clases modifiquen directamente la lista.
        return List.copyOf(tasks);
    }

    public Task createTask(String title) {
        // Las tareas nuevas comienzan como no completadas.
        Task newTask = new Task(
                nextId,
                title,
                false
        );

        tasks.add(newTask);
        nextId++;

        return newTask;
    }
}