package com.luckraw.effi_planner.service;

import com.luckraw.effi_planner.dto.TaskDTO;
import com.luckraw.effi_planner.mapper.TaskMapper;
import com.luckraw.effi_planner.model.Task;
import com.luckraw.effi_planner.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private TaskMapper taskMapper;

    public List<TaskDTO> findAll() {
        return taskRepository.findAll().stream()
                .map(taskMapper::toDTO)
                .collect(Collectors.toList());
    }

    public TaskDTO save(TaskDTO taskDTO) {
        Task task = taskMapper.toEntity(taskDTO);
        Task savedTask = taskRepository.save(task);
        return taskMapper.toDTO(savedTask);
    }
}
