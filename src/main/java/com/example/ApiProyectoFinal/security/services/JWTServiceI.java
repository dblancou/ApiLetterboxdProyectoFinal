package com.example.ApiProyectoFinal.security.services;

import com.example.ApiProyectoFinal.persistence.model.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.security.Key;
import java.util.Map;

public interface JWTServiceI {
    String getToken(User user);
    String getToken(Map<String, Object> extraClaims, User user);
    Key getKey();
    String getUsernameFromToken(String token);
    boolean isTokenValid(String token, UserDetails userDetails);
}