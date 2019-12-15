package com.personjc.todo.dao;

import com.personjc.todo.model.Task;

import java.util.List;
import java.util.UUID;

public interface TaskDao {

    int addTask(Task task);

    int deleteTask(UUID taskId);

    int updateTask(String description, UUID taskId);

    List<Task> retrieveAllTasks();

    int completeTask(UUID taskId);
}
