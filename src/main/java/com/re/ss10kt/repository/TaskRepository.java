package com.re.ss10kt.repository;

import com.re.ss10kt.model.TaskItem;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {
    private final List<TaskItem> taskItemList;


    public TaskRepository() {
        taskItemList = new ArrayList<>();
        taskItemList.add(new TaskItem("1", "CV1", LocalDate.of(2026, 6,5), "HIGH"));
        taskItemList.add(new TaskItem("2", "CV2", LocalDate.of(2026, 7,5), "MEDIUM"));
        taskItemList.add(new TaskItem("3", "CV3", LocalDate.of(2026, 6,6), "HIGH"));
        taskItemList.add(new TaskItem("4", "CV4", LocalDate.of(2026, 7,6), "LOW"));
    }

    public List<TaskItem> getAllTask() {
        return taskItemList;
    }

    public void addTaskItem(TaskItem taskItem) {
        taskItemList.add(taskItem);
    }
}
