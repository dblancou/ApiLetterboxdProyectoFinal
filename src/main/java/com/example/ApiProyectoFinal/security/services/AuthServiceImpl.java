package com.example.ApiProyectoFinal.security.services;

import com.example.ApiProyectoFinal.persistence.model.User;
import com.example.ApiProyectoFinal.persistence.repository.UserRepositoryI;
import com.example.ApiProyectoFinal.security.model.AuthResponse;
import com.example.ApiProyectoFinal.security.model.LoginRequest;
import com.example.ApiProyectoFinal.security.model.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Implementación de los servicios de autenticación.
 *
 * @author Daniel Blanco
 */

@Service
public class AuthServiceImpl implements AuthServiceI {

    @Autowired
    private UserRepositoryI userRepo;

    @Autowired
    private JWTServiceI jwtMngm;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    /**
     * Registra un nuevo usuario en el sistema.
     *
     * @param request La solicitud de registro.
     * @return La respuesta de autenticación.
     */

    @Override
    public AuthResponse register(RegisterRequest request) {
        // Creación del usuario solo con nombre de usuario y contraseña
        User user = new User(request.getUsername(), passwordEncoder.encode(request.getPassword()));
        userRepo.save(user);
        return new AuthResponse(jwtMngm.getToken(user));
    }


    /**
     * Inicia sesión en el sistema.
     *
     * @param request La solicitud de inicio de sesión.
     * @return La respuesta de autenticación.
     */

    @Override
    public AuthResponse login(LoginRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(),
                request.getPassword()));
        User user = userRepo.findByUsername(request.getUsername()).orElseThrow();
        return new AuthResponse(jwtMngm.getToken(user));
    }
}
