package com.viamatica.webservices.domain.repository;

import java.util.List;
import java.util.Optional;

import com.viamatica.webservices.persistence.model.Producto;

public interface ProductoRepository {
	
	Optional<Producto> getProduct(int idProduct);
	Optional<List<Producto>> getProducts();
	Producto save(Producto producto);

}
