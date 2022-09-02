package com.viamatica.webservices.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viamatica.webservices.domain.repository.CategoriaRepository;
import com.viamatica.webservices.persistence.model.Categoria;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> getCategorias(){
		return categoriaRepository.getCategorias();
	}

}
