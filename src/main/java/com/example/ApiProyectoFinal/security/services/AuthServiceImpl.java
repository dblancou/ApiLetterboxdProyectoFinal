package com.example.ApiProyectoFinal.security.services;

import com.example.ApiProyectoFinal.persistence.model.User;
import com.example.ApiProyectoFinal.persistence.repository.UserRepositoryI;
import com.example.ApiProyectoFinal.security.model.AuthResponse;
import com.example.ApiProyectoFinal.security.model.LoginRequest;
import com.example.ApiProyectoFinal.security.model.RegisterRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthServiceI {

    private static final Logger logger = LoggerFactory.getLogger(AuthServiceImpl.class);

    @Autowired
    private UserRepositoryI userRepo;

    @Autowired
    private JWTServiceI jwtMngm;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public AuthResponse register(RegisterRequest request) {
        User user = new User(request.getUsername(), passwordEncoder.encode(request.getPassword()));
        userRepo.save(user);
        return new AuthResponse(jwtMngm.getToken(user));
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        User user = userRepo.findByUsername(request.getUsername()).orElseThrow();
        logger.debug("Authenticated user: {}", user.getUsername());
        String token = jwtMngm.getToken(user);
        logger.debug("Generated token: {}", token);
        System.out.println("Authenticated user: " + user.getUsername());
        System.out.println("Generated token: " + token);
        return new AuthResponse(token);
    }

}
