package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.UserDTO;
import com.ticketmanagement.ticketing.model.entity.UserEntity;

public class UserMapper {
    public static UserDTO toDTO(UserEntity user) {
        if (user == null) return null;
        UserDTO dto = new UserDTO();
        dto.setUserId(user.getUserId());
        dto.setUsername(user.getUsername());
        dto.setPassword(user.getPassword());
        return dto;
    }

    public static UserEntity toEntity(UserDTO dto) {
        if (dto == null) return null;
        UserEntity user = new UserEntity();
        user.setUserId(dto.getUserId());
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        return user;
    }
}