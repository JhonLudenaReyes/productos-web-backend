package com.viamatica.webservices.domain.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viamatica.webservices.domain.repository.LoginRepository;
import com.viamatica.webservices.persistence.model.Login;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepository;
	
	public Optional<Login> getUsuarioLogin(String usuario, String contrasenia){
		return loginRepository.getUsuarioLogin(usuario, contrasenia);
	}

}
