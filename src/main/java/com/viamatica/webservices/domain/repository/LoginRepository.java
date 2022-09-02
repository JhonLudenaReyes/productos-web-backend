package com.viamatica.webservices.domain.repository;

import java.util.Optional;

import com.viamatica.webservices.persistence.model.Login;

public interface LoginRepository {
	
	Optional<Login> getUsuarioLogin(String usuario, String contrasenia);

}
