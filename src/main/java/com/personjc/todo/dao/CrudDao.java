package com.personjc.todo.dao;

import com.personjc.todo.model.Task;

import java.util.List;
import java.util.UUID;

public interface CrudDao<T> {

    void add(String description);

    void delete(UUID id);

    void update(String description, UUID id);

    List<T> retrieveAll();
}
