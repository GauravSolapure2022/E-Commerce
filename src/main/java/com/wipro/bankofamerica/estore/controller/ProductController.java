package com.wipro.bankofamerica.estore.controller;

import java.util.List;
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

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	@PostMapping("/save")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
		
		Product saveProduct = productservice.saveProduct(product);
		
		return ResponseEntity.ok(saveProduct);
		
	}
	
	@GetMapping("/get")
	public List<Product> getAllProduct(){
		
		return productservice.getAllProduct();
		
		}
	
	@GetMapping("get/{id}")
	public ResponseEntity<Optional<Product>> getProductById(@PathVariable int id) throws Exception{
		Optional<Product> product = productservice.getProductById(id);
		return ResponseEntity.ok().body(product);
		
	}
	
	@DeleteMapping("/delete")
	public void deleteProduct(Integer id) {
		
	}
}
