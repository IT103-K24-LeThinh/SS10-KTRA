package com.re.ss10kt.controller;

import com.re.ss10kt.dto.TaskItemDto;
import com.re.ss10kt.model.TaskItem;
import com.re.ss10kt.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class TaskController {
    private final TaskService taskService;


    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public String getTasks(Model model) {
        List<TaskItem> taskItems = taskService.getAllTask();
        model.addAttribute("taskItemList", taskItems);
        return "task-list";
    }

    @GetMapping("/task/form")
    public String getTaskForm(Model model) {
        model.addAttribute("taskItem", new TaskItem());
        return "task-form";
    }

    @PostMapping("/task/form")
    public String postNewTask(@Valid @ModelAttribute("taskItem") TaskItemDto taskItem, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "task-form";
        }

        taskService.addTaskItem(new TaskItem(taskItem.getId(), taskItem.getTitle(), taskItem.getDeadline(), taskItem.getPriority()));
        return "redirect:/tasks";
    }
}
