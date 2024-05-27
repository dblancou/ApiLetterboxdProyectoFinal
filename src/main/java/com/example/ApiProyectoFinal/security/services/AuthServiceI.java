package com.example.ApiProyectoFinal.security.services;

import com.example.ApiProyectoFinal.security.model.AuthResponse;
import com.example.ApiProyectoFinal.security.model.LoginRequest;
import com.example.ApiProyectoFinal.security.model.RegisterRequest;

public interface AuthServiceI {
    AuthResponse register(RegisterRequest request);
    AuthResponse login(LoginRequest request);
}