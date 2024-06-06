package com.luckraw.effi_planner.dto;

import java.util.Set;

public class UserDTO {

    private Long id;
    private String username;
    private Set<ProjectDTO> projects;

    public UserDTO(Long id, String username, Set<ProjectDTO> projects) {
        this.id = id;
        this.username = username;
        this.projects = projects;
    }

    public UserDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<ProjectDTO> getProjects() {
        return projects;
    }

    public void setProjects(Set<ProjectDTO> projects) {
        this.projects = projects;
    }
}
