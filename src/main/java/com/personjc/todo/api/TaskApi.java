package com.personjc.todo.api;

import com.personjc.todo.model.Task;
import com.personjc.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

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

    @GetMapping
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }
}
