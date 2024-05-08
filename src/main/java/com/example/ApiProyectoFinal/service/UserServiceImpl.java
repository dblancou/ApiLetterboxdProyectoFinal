package com.example.ApiProyectoFinal.service;

import com.example.ApiProyectoFinal.dto.UserDTO;
import com.example.ApiProyectoFinal.persistence.model.User;
import com.example.ApiProyectoFinal.persistence.repository.UserRepositoryI;
import com.example.ApiProyectoFinal.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserServiceI {
    @Autowired
    private UserRepositoryI userRepository;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = convertToEntity(userDTO);
        User savedUser = userRepository.save(user);
        return convertToDTO(savedUser);
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        User user = convertToEntity(userDTO);
        User updatedUser = userRepository.save(user);
        return convertToDTO(updatedUser);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public UserDTO getUserById(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        return convertToDTO(user);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public UserDTO findByUsername(String username) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return convertToDTO(user);
    }

    private UserDTO convertToDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setUserId(user.getUserId());
        dto.setUsername(user.getUsername());
        dto.setCreateDate(user.getCreateDate());
        return dto;
    }

    private User convertToEntity(UserDTO userDTO) {
        User user = new User();
        user.setUserId(userDTO.getUserId());
        user.setUsername(userDTO.getUsername());
        //user.setPassword(userDTO.getPassword()); // Assumption: Password comes pre-hashed or will be hashed in a layer above/before saving
        return user;
    }
}
