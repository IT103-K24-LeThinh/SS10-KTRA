package com.re.ss10kt.service;

import com.re.ss10kt.model.TaskItem;
import com.re.ss10kt.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;


    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<TaskItem> getAllTask() {
        return taskRepository.getAllTask();
    }

    public void addTaskItem(TaskItem taskItem) {
        taskRepository.addTaskItem(taskItem);
    }
}
