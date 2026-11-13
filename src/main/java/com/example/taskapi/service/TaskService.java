package com.example.taskapi.service;

import com.example.taskapi.model.Task;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private final Map<Long, Task> store = new ConcurrentHashMap<>();
    private final AtomicLong idSequence = new AtomicLong(0);

    public List<Task> findAll() {
        return store.values().stream()
                .sorted(Comparator.comparing(Task::getId))
                .toList();
    }

    public Task create(String title) {
        long id = idSequence.incrementAndGet();
        Task task = new Task(id, title);
        store.put(id, task);
        return task;
    }

    public Optional<Task> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }
}
