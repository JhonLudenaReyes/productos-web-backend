package com.viamatica.webservices.persistence;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.viamatica.webservices.domain.repository.LoginRepository;
import com.viamatica.webservices.persistence.dao.LoginDaoRepository;
import com.viamatica.webservices.persistence.model.Login;

@Repository
public class LoginRepositoryImpl implements LoginRepository{
	
	@Autowired
	private LoginDaoRepository loginDaoRepository;

	@Override
	public Optional<Login> getUsuarioLogin(String usuario, String contrasenia) {
		// TODO Auto-generated method stub
		return loginDaoRepository.findByUsuarioAndContrasenia(usuario, contrasenia);
	}

}
