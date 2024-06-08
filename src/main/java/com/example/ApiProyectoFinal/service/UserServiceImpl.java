package com.example.ApiProyectoFinal.service;

import com.example.ApiProyectoFinal.dto.UserDTO;
import com.example.ApiProyectoFinal.persistence.model.User;
import com.example.ApiProyectoFinal.persistence.repository.UserRepositoryI;
import com.example.ApiProyectoFinal.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    /*
    @Override
    public UserDTO findByUsername(String username) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return convertToDTO(user);
    }

     */

    @Override
    public UserDTO findUserByUsernameDTO(String username) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        System.out.println("User found: " + user.getUsername() + " with ID: " + user.getUserId());

        UserDTO userDto = new UserDTO();
        userDto.setUserId(user.getUserId());
        userDto.setUsername(user.getUsername());
        userDto.setCreateDate(user.getCreateDate());
        return userDto;
    }

    @Transactional
    @Override
    public void followUser(String username, Long followUserId) {
        User currentUser = findUserByUsername(username);
        User followUser = userRepository.findById(followUserId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!currentUser.getFollowing().contains(followUser)) {
            currentUser.getFollowing().add(followUser);
            followUser.getFollowers().add(currentUser);
            userRepository.save(currentUser);
            userRepository.save(followUser);
            System.out.println("User " + currentUser.getUsername() + " is now following " + followUser.getUsername());
        } else {
            System.out.println("User " + currentUser.getUsername() + " already follows " + followUser.getUsername());
        }

        System.out.println("Current User Following: " + currentUser.getFollowing());
        System.out.println("Follow User Followers: " + followUser.getFollowers());
    }

    @Transactional
    @Override
    public void unfollowUser(String username, Long unfollowUserId) {
        User currentUser = findUserByUsername(username);
        User unfollowUser = userRepository.findById(unfollowUserId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (currentUser.getFollowing().contains(unfollowUser)) {
            currentUser.getFollowing().remove(unfollowUser);
            unfollowUser.getFollowers().remove(currentUser);
            userRepository.save(currentUser);
            userRepository.save(unfollowUser);
            System.out.println("User " + currentUser.getUsername() + " has unfollowed " + unfollowUser.getUsername());
        } else {
            System.out.println("User " + currentUser.getUsername() + " does not follow " + unfollowUser.getUsername());
        }

        System.out.println("Current User Following: " + currentUser.getFollowing());
        System.out.println("Unfollow User Followers: " + unfollowUser.getFollowers());
    }

    private User findUserByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

    @Override
    @Transactional(readOnly = true)
    public List<UserDTO> getFollowers(String username) {
        User user = findUserByUsername(username);
        return user.getFollowers().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<UserDTO> getFollows(String username) {
        User user = findUserByUsername(username);
        return user.getFollowing().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO updateUserDescription(String username, UserDTO userUpdateDTO) {
        return null;
    }

    @Transactional(readOnly = true)
    @Override
    public boolean isFollowing(String username, Long userId) {
        User currentUser = findUserByUsername(username);
        User targetUser = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        return currentUser.getFollowing().contains(targetUser);
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