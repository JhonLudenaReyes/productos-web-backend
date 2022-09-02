package com.viamatica.webservices.persistence.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viamatica.webservices.persistence.model.Login;

public interface LoginDaoRepository extends JpaRepository<Login, Integer>{
	
	Optional<Login> findByUsuarioAndContrasenia(String usuario, String contrasenia);

}
