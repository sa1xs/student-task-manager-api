package com.sebas.studenttaskmanagerapi.service;

import com.sebas.studenttaskmanagerapi.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    // Almacenamiento temporal de las tareas mientras la aplicación esté encendida.
    private final List<Task> tasks = new ArrayList<>();

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
}