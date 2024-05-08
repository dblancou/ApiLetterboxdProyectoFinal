package com.example.ApiProyectoFinal.security.services;


import com.example.ApiProyectoFinal.security.model.AuthResponse;
import com.example.ApiProyectoFinal.security.model.LoginRequest;
import com.example.ApiProyectoFinal.security.model.RegisterRequest;

/**
 * Interfaz para los servicios de autenticación.
 *
 * @author Daniel Blanco
 */
public interface AuthServiceI {

    /**
     * Registra un nuevo usuario en el sistema.
     *
     * @param request La solicitud de registro.
     * @return La respuesta de autenticación.
     */
    AuthResponse register(RegisterRequest request);

    /**
     * Inicia sesión en el sistema.
     *
     * @param request La solicitud de inicio de sesión.
     * @return La respuesta de autenticación.
     */
    AuthResponse login(LoginRequest request);

}
