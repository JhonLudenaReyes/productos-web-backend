package com.viamatica.webservices.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viamatica.webservices.domain.repository.ProductoRepository;
import com.viamatica.webservices.persistence.model.Producto;

@Service
public class ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	public Optional<Producto> getProduct(int idProduct){
		return productoRepository.getProduct(idProduct);
	}
	
	public Optional<List<Producto>> getProductos(){
		return productoRepository.getProducts();
	}
	
	public Producto save(Producto producto) {
		return productoRepository.save(producto);
	}

}
