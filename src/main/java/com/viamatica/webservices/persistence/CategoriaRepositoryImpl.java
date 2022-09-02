package com.viamatica.webservices.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.viamatica.webservices.domain.repository.CategoriaRepository;
import com.viamatica.webservices.persistence.dao.CategoriaDaoRepository;
import com.viamatica.webservices.persistence.model.Categoria;

@Repository
public class CategoriaRepositoryImpl implements CategoriaRepository{
	
	@Autowired
	private CategoriaDaoRepository categoriaDaoRepository;

	@Override
	public List<Categoria> getCategorias() {
		// TODO Auto-generated method stub
		List<Categoria> categorias = categoriaDaoRepository.findAll();
		return categorias;
	}

}
