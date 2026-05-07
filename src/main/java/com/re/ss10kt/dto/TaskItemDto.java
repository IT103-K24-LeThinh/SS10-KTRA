package com.re.ss10kt.dto;

import com.re.ss10kt.validation.annotation.ValidDeadline;
import com.re.ss10kt.validation.annotation.ValidPriority;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class TaskItemDto {
    @NotNull
    private String id;

    @NotBlank
    @Size(min = 5)
    private String title;

    @NotNull
    @ValidDeadline
    private LocalDate deadline;

    @NotBlank
    @ValidPriority
    private String priority;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
