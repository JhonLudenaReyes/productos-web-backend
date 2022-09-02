package com.viamatica.webservices.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.viamatica.webservices.domain.repository.ProductoRepository;
import com.viamatica.webservices.persistence.dao.ProductoDaoRepository;
import com.viamatica.webservices.persistence.model.Producto;

@Repository
public class ProductoRepositoryImpl implements ProductoRepository{
	
	@Autowired
	private ProductoDaoRepository productoDaoRepository;

	@Override
	public Optional<List<Producto>> getProducts() {
		// TODO Auto-generated method stub
		Optional<List<Producto>> productos = productoDaoRepository.findByEstado("A");
		return productos;
	}

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productoDaoRepository.save(producto);
	}

	@Override
	public Optional<Producto> getProduct(int idProduct) {
		// TODO Auto-generated method stub
		Optional<Producto> product = productoDaoRepository.findById(idProduct);
		
		return product;
	}
	
	

}
