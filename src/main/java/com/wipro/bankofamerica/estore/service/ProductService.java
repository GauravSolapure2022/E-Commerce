package com.wipro.bankofamerica.estore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Product;

@Service
public interface ProductService {
	
	public Product saveProduct(Product product);
	
	public List<Product> getAllProduct();
	
	public Optional<Product> getProductById(Integer id) throws Exception;
	
	public void deleteProduct(Integer id);
    
	public Product updateProduct(Product product);
}
