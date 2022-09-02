package com.viamatica.webservices.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viamatica.webservices.domain.service.LoginService;
import com.viamatica.webservices.persistence.model.Login;

@RestController
@RequestMapping("/sesion")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login")
	public ResponseEntity<Login> getUsuarioLogin(@RequestBody Login login){
		return loginService.getUsuarioLogin(login.getUsuario(), login.getContrasenia())
				.map(user -> new ResponseEntity<>(user, HttpStatus.OK))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

}
