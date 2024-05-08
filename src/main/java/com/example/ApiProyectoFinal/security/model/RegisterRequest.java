package com.example.ApiProyectoFinal.security.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase modelo para representar la solicitud de registro de usuario.
 *
 * @author Daniel Blanco
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    /** El nombre de usuario proporcionado en la solicitud de registro. */
    String username;

    /** La contraseña proporcionada en la solicitud de registro. */
    String password;

}
