package com.example.ApiProyectoFinal.service;

import com.example.ApiProyectoFinal.dto.UserDTO;

import java.util.List;

public interface UserServiceI {
    UserDTO createUser(UserDTO userDTO);
    UserDTO updateUser(UserDTO userDTO);
    void deleteUser(Long userId);
    UserDTO getUserById(Long userId);
    List<UserDTO> getAllUsers();
    UserDTO findByUsername(String username);
}
