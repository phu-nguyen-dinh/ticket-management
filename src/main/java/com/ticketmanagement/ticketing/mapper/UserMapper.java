package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.UserDTO;
import com.ticketmanagement.ticketing.model.entity.UserEntity;

public class UserMapper {
    public static UserDTO toDTO(UserEntity user) {
        if (user == null) return null;
        UserDTO dto = new UserDTO();
        dto.setUser_id(user.getUser_id());
        dto.setUsername(user.getUsername());
        dto.setPassword(user.getPassword());
        return dto;
    }

    public static UserEntity toEntity(UserDTO dto) {
        if (dto == null) return null;
        UserEntity user = new UserEntity();
        user.setUser_id(dto.getUser_id());
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        return user;
    }
}