package com.viamatica.webservices.domain.repository;

import java.util.List;

import com.viamatica.webservices.persistence.model.Categoria;

public interface CategoriaRepository {
	
	List<Categoria> getCategorias();

}
