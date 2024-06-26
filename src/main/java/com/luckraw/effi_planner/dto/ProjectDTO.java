package com.luckraw.effi_planner.dto;

import java.util.Set;

public class ProjectDTO {

    private Long id;
    private String name;
    private String description;
    private UserDTO user;
    private Set<TaskDTO> tasks;

    public ProjectDTO() {
    }

    public ProjectDTO(Long id, String name, String description, UserDTO user, Set<TaskDTO> tasks) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.user = user;
        this.tasks = tasks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public Set<TaskDTO> getTasks() {
        return tasks;
    }

    public void setTasks(Set<TaskDTO> tasks) {
        this.tasks = tasks;
    }
}
