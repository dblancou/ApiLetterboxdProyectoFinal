package com.example.ApiProyectoFinal.service;

import com.example.ApiProyectoFinal.dto.UserDTO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserServiceI {
    UserDTO createUser(UserDTO userDTO);
    UserDTO updateUser(UserDTO userDTO);
    void deleteUser(Long userId);
    UserDTO getUserById(Long userId);
    List<UserDTO> getAllUsers();
    //UserDTO findByUsername(String username);

    UserDTO findUserByUsernameDTO(String username);

    UserDTO updateUserDescription(String username, UserDTO userUpdateDTO);

    void followUser(String username, Long followUserId);

    void unfollowUser(String username, Long unfollowUserId);

    List<UserDTO> getFollowers(String username);

    List<UserDTO> getFollows(String username);

    @Transactional(readOnly = true)
    boolean isFollowing(String username, Long userId);
}
