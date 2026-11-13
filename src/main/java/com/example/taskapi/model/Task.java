package com.example.taskapi.model;

import java.time.Instant;

public class Task {
    private final Long id;
    private final String title;
    private final boolean completed;
    private final Instant createdAt;

    public Task(Long id, String title) {
        this.id = id;
        this.title = title;
        this.completed = false;
        this.createdAt = Instant.now();
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public boolean isCompleted() { return completed; }
    public Instant getCreatedAt() { return createdAt; }
}
