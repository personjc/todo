package com.personjc.todo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Task {

    private UUID id;
    private String description;
    private boolean complete;

    public Task (@JsonProperty("description") String description){
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
