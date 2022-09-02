package com.viamatica.webservices.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viamatica.webservices.domain.service.CategoriaService;
import com.viamatica.webservices.persistence.model.Categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/list-categoria")
	public ResponseEntity<List<Categoria>> getCategoria(){
		return new ResponseEntity<>(categoriaService.getCategorias(), HttpStatus.OK);
	}

}
