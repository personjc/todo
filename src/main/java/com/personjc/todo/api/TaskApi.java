package com.personjc.todo.api;

import com.personjc.todo.model.Task;
import com.personjc.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RequestMapping("api/v1/task")
@RestController
public class TaskApi {

    private final TaskService taskService;

    @Autowired
    public TaskApi(TaskService taskService){
        this.taskService = taskService;
    }

    @PostMapping
    public void addTask(@Valid @NotNull @RequestBody Task task){
        taskService.addTask(task);
    }
}
