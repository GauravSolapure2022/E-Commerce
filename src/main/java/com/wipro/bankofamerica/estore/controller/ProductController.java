package com.wipro.bankofamerica.estore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankofamerica.estore.model.Product;
import com.wipro.bankofamerica.estore.serviceImpl.ProductServiceImpl;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class ProductController {
	@Autowired
	ProductServiceImpl productServiceImpl;
	@PostMapping(value="/saveProduct",consumes = "application/json" , produces = "application/json")
	public Product saveProducts( @RequestBody Product products) {
		System.out.println(products);
     Product saveProduct = productServiceImpl.saveProduct(products);
		return saveProduct;
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable("id") Integer hbd) {
		Product productById = productServiceImpl.getProductById(hbd);
		return productById;
		
		
	}
	@GetMapping("/product")
	public Iterable<Product> getAllProduct() {
		Iterable<Product> allProduct = productServiceImpl.getAllProduct();
		return allProduct;
	}
	
	@DeleteMapping("/productDelete/{id}")
	   public void deleteProduct(@PathVariable Integer id)
	   {
		productServiceImpl.deleteProduct(id);
		System.out.println("Product delete successfully");
	   }
	
	
	
	
	
	

}
