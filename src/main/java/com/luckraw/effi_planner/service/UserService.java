package com.luckraw.effi_planner.service;

import com.luckraw.effi_planner.dto.UserDTO;
import com.luckraw.effi_planner.mapper.UserMapper;
import com.luckraw.effi_planner.model.User;
import com.luckraw.effi_planner.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private UserRepository userRepository;
    private UserMapper userMapper;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO findByUsername(String username) {
        User user = userRepository.findByUsername(username);
        return userMapper.toDTO(user);
    }

    public UserDTO save(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        User savedUser = userRepository.save(user);
        return userMapper.toDTO(savedUser);
    }
}
