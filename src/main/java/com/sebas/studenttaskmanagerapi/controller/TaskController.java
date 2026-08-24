package com.sebas.studenttaskmanagerapi.controller;

import com.sebas.studenttaskmanagerapi.model.Task;
import com.sebas.studenttaskmanagerapi.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    // Spring proporciona automáticamente el servicio al crear el controlador.
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getTasks() {
        // Delega la obtención de tareas al servicio.
        return taskService.getAllTasks();
    }
}