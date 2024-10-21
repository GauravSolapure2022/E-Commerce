package com.wipro.bankofamerica.estore.service;

import java.util.List;

import com.wipro.bankofamerica.estore.dto.Product;

public interface ProductService {
	public Iterable<Product> getAllProduct();
	public List<Product> saveProduct(List<Product> product);
	public <optional>Product getProductById(Integer Id);
	public void deleteProduct(Integer id);
	public	Product updateProduct(Integer id, Product product);  
}

