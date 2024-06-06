package com.luckraw.effi_planner.mapper;

import com.luckraw.effi_planner.dto.UserDTO;
import com.luckraw.effi_planner.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);
}
