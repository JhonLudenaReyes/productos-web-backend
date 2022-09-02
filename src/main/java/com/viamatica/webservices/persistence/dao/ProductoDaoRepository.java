package com.viamatica.webservices.persistence.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viamatica.webservices.persistence.model.Producto;

public interface ProductoDaoRepository extends JpaRepository<Producto, Integer>{
	
	Optional<List<Producto>> findByEstado(String estado);

}
