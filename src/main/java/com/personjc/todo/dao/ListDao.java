package com.personjc.todo.dao;

import com.personjc.todo.model.TaskList;

import java.util.List;
import java.util.UUID;

public interface ListDao extends CrudDao {

    @Override
    void add(String description);

    @Override
    void delete(UUID listId);

    @Override
    void update(String description, UUID listId);

    @Override
    List<TaskList> retrieveAll();
}
