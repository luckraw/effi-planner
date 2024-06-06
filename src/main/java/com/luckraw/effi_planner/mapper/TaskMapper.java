package com.luckraw.effi_planner.mapper;

import com.luckraw.effi_planner.dto.TaskDTO;
import com.luckraw.effi_planner.model.Task;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDTO toDTO(Task task);
    Task toEntity(TaskDTO taskDTO);
}
