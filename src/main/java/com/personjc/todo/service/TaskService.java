package com.personjc.todo.service;

import com.personjc.todo.dao.TaskDao;
import com.personjc.todo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskService {

    private final TaskDao taskDao;

    @Autowired
    public TaskService(@Qualifier("postgres") TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    public int addTask(Task task) {
        return taskDao.addTask(task);
    }

    public List<Task> getAllTasks() {
        return taskDao.getAllTasks();
    }

//    public Optional<Task> getTaskById(UUID id) {return taskDao.}

    public int deleteTask(UUID id) {
        return taskDao.deleteTask(id);
    }

    public int updateTask(UUID id, String description) {
        return taskDao.updateTask(description, id);
    }

    public int completeTask(UUID id) {
        return taskDao.completeTask(id);
    }
}
