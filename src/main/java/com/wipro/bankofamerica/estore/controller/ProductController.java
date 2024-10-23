package com.wipro.bankofamerica.estore.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankofamerica.estore.model.Product;
import com.wipro.bankofamerica.estore.service.ProductService;
//Sanket
@RestController 
@RequestMapping ("/product")
public class ProductController {
	
	@Autowired 
	private ProductService productservice ;
	
	@PostMapping 
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		
		Product saveProduct = productservice.saveProduct(product);
		return ResponseEntity.ok(saveProduct) ;
		
	}
	
	@GetMapping("/get")
	public Iterable<Product> getAllProduct(){
		return productservice.getAllProduct();
		
	}
	
	@GetMapping("/get/{id}")
	public Optional<Product> getProductById(@PathVariable Long id){
		return productservice.getProductById(id);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteProduct(Long id) {
		
	}
}
