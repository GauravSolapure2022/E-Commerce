package com.wipro.bankofamerica.controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankofamerica.model.Product;
import com.wipro.bankofamerica.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	@PostMapping("/saveproduct")
	public ResponseEntity<Product>saveProduct(@RequestBody Product product)
	{
		return productservice.saveProduct(product);
	}
	
	@GetMapping("/getAllProduct")
	public ResponseEntity<List<Product>>getAllProduct()
	{
		return productservice.getAllProduct();
	}
	
	@GetMapping("/getProductByid/{pid}")
	public ResponseEntity<Product>getProductById(@PathVariable Integer pid)
	{
			return productservice.getProductById(pid);
	}
	
	@DeleteMapping("/deleteproductByid/{pid}")
	public String deleteProduct(@PathVariable Integer pid)
	{
		return productservice.deleteProductByid(pid);
	}
	
	@PutMapping("/updateproduct")
	public ResponseEntity<Product>updateProduct(@RequestBody Product product)
	{
		return productservice.updateProduct(product);
	}
}
