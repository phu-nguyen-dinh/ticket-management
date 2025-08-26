package com.ticketmanagement.ticketing.services;

import com.ticketmanagement.ticketing.dto.userDTO;

import java.util.List;

public interface userService {
    userDTO createUser(userDTO userDTO);
    userDTO getUserById(Integer userId);
    List<userDTO> getAllUsers();
    userDTO updateUser(Integer userId, userDTO userDTO);
    void deleteUser(Integer userId);
}
