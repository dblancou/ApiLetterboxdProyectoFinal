package com.example.ApiProyectoFinal.security.controllers;

import com.example.ApiProyectoFinal.security.model.AuthResponse;
import com.example.ApiProyectoFinal.security.model.LoginRequest;
import com.example.ApiProyectoFinal.security.model.RegisterRequest;
import com.example.ApiProyectoFinal.security.services.AuthServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin
@Order(1)
@Tag(name = "Authentication", description = "Endpoints for user authentication")
public class AuthController {

    @Autowired
    private AuthServiceImpl authMngm;

    @PostMapping(value = "/register")
    @Operation(summary = "Register a new user")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authMngm.register(request));
    }

    @PostMapping(value = "/login")
    @Operation(summary = "Login with username and password")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authMngm.login(request));
    }
}
