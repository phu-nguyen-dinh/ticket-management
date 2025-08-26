package com.ticketmanagement.ticketing.services;

import com.ticketmanagement.ticketing.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO getUserById(Integer userId);
    List<UserDTO> getAllUsers();
    UserDTO updateUser(Integer userId, UserDTO userDTO);
    void deleteUser(Integer userId);
}
