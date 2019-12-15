package com.personjc.todo.dao;

import com.personjc.todo.model.TaskList;

import java.util.List;
import java.util.UUID;

public interface ListDao {

    int addList(String description);

    int deleteList(UUID listId);

    int updateList(String description, UUID listId);

    List<TaskList> retrieveAllLists();
}
