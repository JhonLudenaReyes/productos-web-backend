package com.viamatica.webservices.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viamatica.webservices.domain.service.ProductoService;
import com.viamatica.webservices.persistence.model.Producto;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/{idProduct}")
	public ResponseEntity<Producto> getProduct(@PathVariable("idProduct") int idProduct){
		return productoService.getProduct(idProduct)
				.map(product -> new ResponseEntity<>(product, HttpStatus.OK))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@GetMapping("/list-products")
	public ResponseEntity<List<Producto>> getProducts(){
		return productoService.getProductos()
				.map(product-> new ResponseEntity<>(product, HttpStatus.OK))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@PostMapping("/save-product")
	public ResponseEntity<Producto> save(@RequestBody Producto producto){
		return new ResponseEntity<>(productoService.save(producto), HttpStatus.CREATED);
	}
	
	@PutMapping("/update-product")
	public ResponseEntity<Producto> updateProduct(@RequestBody Producto producto){
		Optional<Producto> optionalProduct = productoService.getProduct(producto.getIdProducto());
		if(optionalProduct.isPresent()) {
			return new ResponseEntity<>(productoService.save(producto), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/delete-product/{idProduct}")
	public ResponseEntity<Producto> deleteProduct(@PathVariable("idProduct") int idProduct){
		Optional<Producto> optionalProduct = productoService.getProduct(idProduct);
		if(optionalProduct.isPresent()) {
			Producto updateProduct = optionalProduct.get();
			updateProduct.setEstado("I");
			return new ResponseEntity<>(productoService.save(updateProduct), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	

}
