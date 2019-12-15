package com.personjc.todo.dao;

import com.personjc.todo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("postgres")
public class TaskDataAccessService implements TaskDao{

    private final String UUID_COLUMN = "taskId";
    private final String DESC_COLUMN = "description";
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public TaskDataAccessService(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addTask(Task task) {
        String insertSql = "INSERT INTO TODO (" + UUID_COLUMN + ", " + DESC_COLUMN + ") VALUES (?, ?);";
        return jdbcTemplate.update(insertSql, UUID.randomUUID(), task.getDescription());
    }

    @Override
    public int deleteTask(UUID taskId) {
        return 0;
    }

    @Override
    public int updateTask(String description, UUID taskId) {
        return 0;
    }

    @Override
    public List<Task> getAllTasks() {
        String sql = "SELECT " + UUID_COLUMN + ", " + DESC_COLUMN + " FROM TODO;";

        List<Task> tasks = jdbcTemplate.query(sql, (resultSet, i) -> {
            UUID id = UUID.fromString(resultSet.getString("taskid"));
            String description = resultSet.getString("description");
            return new Task(id, description);
        });

        return tasks;
    }

    @Override
    public int completeTask(UUID taskId) {
        return 0;
    }
}
