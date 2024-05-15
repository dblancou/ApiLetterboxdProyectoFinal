package com.example.ApiProyectoFinal.controller;

import com.example.ApiProyectoFinal.dto.UserDTO;
import com.example.ApiProyectoFinal.service.UserServiceI;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;


import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {


    @Autowired
    private UserServiceI userService;

     /*

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(userService.createUser(userDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        userDTO.setUserId(id);
        return ResponseEntity.ok(userService.updateUser(userDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }

     */

    @GetMapping("/public/{username}")
    @Operation(summary = "Get user by username")
    public ResponseEntity<Object> getUserByUsername(@PathVariable String username) {
        UserDTO userDto = userService.findUserByUsernameDTO(username);
        return ResponseEntity.ok(userDto);

    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    /*
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }

     */

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@AuthenticationPrincipal UserDetails userDetails, @PathVariable Long id) {
        UserDTO user = userService.getUserById(id);

        // Comprobar que el usuario existe
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        // Verificar que el usuario autenticado es el mismo que el usuario a eliminar
        if (!user.getUsername().equals(userDetails.getUsername())) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }

        // Eliminar el usuario
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{id}/follow")
    public ResponseEntity<Void> followUser(@AuthenticationPrincipal UserDetails userDetails, @PathVariable Long id) {
        userService.followUser(userDetails.getUsername(), id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}/unfollow")
    public ResponseEntity<Void> unfollowUser(@AuthenticationPrincipal UserDetails userDetails, @PathVariable Long id) {
        userService.unfollowUser(userDetails.getUsername(), id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/followers/{username}")
    @Operation(summary = "Get a user's followers")
    public ResponseEntity<List<UserDTO>> getFollowers(@PathVariable String username) {
        List<UserDTO> followers = userService.getFollowers(username);
        return ResponseEntity.ok(followers);
    }

    @GetMapping("/follows/{username}")
    @Operation(summary = "Get a user's followeds")
    public ResponseEntity<List<UserDTO>> getFollows(@PathVariable String username) {
        List<UserDTO> follows = userService.getFollows(username);
        return ResponseEntity.ok(follows);
    }

}
