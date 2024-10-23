package com.wipro.bankofamerica.estore.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Product;
@Service
public interface ProductService {
	
	public Iterable<Product> getAllProduct();
	
	public Product saveProduct(Product product); 
	
	public Optional<Product> getProductById(Long id);
	
	public void deleteProduct(Long id);
	
	public Product updateProduct( Product productDetails);



}
