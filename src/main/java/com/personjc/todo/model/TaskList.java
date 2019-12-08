package com.personjc.todo.model;

import org.springframework.scheduling.config.Task;

import java.util.List;
import java.util.UUID;

public class TaskList {

    private UUID id;
    private String name;
    private List<Task> tasks;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
