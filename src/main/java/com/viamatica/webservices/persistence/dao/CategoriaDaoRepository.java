package com.viamatica.webservices.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viamatica.webservices.persistence.model.Categoria;

public interface CategoriaDaoRepository extends JpaRepository<Categoria, Integer>{

}
