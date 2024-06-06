package com.luckraw.effi_planner.mapper;

import com.luckraw.effi_planner.dto.ProjectDTO;
import com.luckraw.effi_planner.model.Project;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectDTO toDTO(Project project);
    Project toEntity(ProjectDTO projectDTO);
}
