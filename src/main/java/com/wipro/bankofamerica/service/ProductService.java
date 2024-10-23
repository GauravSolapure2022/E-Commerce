package com.wipro.bankofamerica.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.model.Product;

@Service
public interface ProductService {

	ResponseEntity<Product> saveProduct(Product product);

	ResponseEntity<List<Product>> getAllProduct();

	ResponseEntity<Product> getProductById(Integer pid);

	String deleteProductByid(Integer pid);

	ResponseEntity<Product> updateProduct(Product product);

	

}
