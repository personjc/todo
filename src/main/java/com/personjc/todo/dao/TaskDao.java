package com.personjc.todo.dao;

import com.personjc.todo.model.Task;

import java.util.List;
import java.util.UUID;

public interface TaskDao extends CrudDao {

    @Override
    void add(String description);

    @Override
    void delete(UUID taskId);

    @Override
    void update(String description, UUID taskId);

    @Override
    List<Task> retrieveAll();

    void completeTask(UUID taskId);
}
