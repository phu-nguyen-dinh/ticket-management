package com.ticketmanagement.ticketing.services.impl;

import com.ticketmanagement.ticketing.dto.UserDTO;
import com.ticketmanagement.ticketing.mapper.UserMapper;
import com.ticketmanagement.ticketing.model.entity.UserEntity;
import com.ticketmanagement.ticketing.repository.UserRepository;
import com.ticketmanagement.ticketing.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        UserEntity user = UserMapper.toEntity(userDTO);
        userRepository.save(user);
        return UserMapper.toDTO(user);
    }

    @Override
    public UserDTO getUserById(Integer userId) {
        UserEntity user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return UserMapper.toDTO(user);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                .stream().map(UserMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO updateUser(Integer userId, UserDTO userDTO) {
        UserEntity user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        userRepository.save(user);
        return UserMapper.toDTO(user);
    }

    @Override
    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }
}
