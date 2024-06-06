package com.luckraw.effi_planner.dto;

public class TaskDTO {

    private Long id;
    private String title;
    private String description;
    private boolean completed;
    private ProjectDTO project;

    public TaskDTO() {
    }

    public TaskDTO(Long id, String title, String description, boolean completed, ProjectDTO project) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.project = project;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public ProjectDTO getProject() {
        return project;
    }

    public void setProject(ProjectDTO project) {
        this.project = project;
    }
}
