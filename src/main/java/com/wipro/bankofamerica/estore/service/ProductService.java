package com.wipro.bankofamerica.estore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.ProductEntity;

@Service
public interface ProductService {

	 List<ProductEntity> getAllProducts();
	    ProductEntity getProductById(Integer id);
	   // ProductEntity addProduct(ProductEntity product);
	    ProductEntity updateProduct(Integer id, ProductEntity product);
	    boolean deleteProduct(Integer id);
		ProductEntity saveProduct(ProductEntity productEntity);
	}

	
//
//	ProductEntity saveProduct(ProductEntity product);
//
//	<optional> ProductEntity getProductById(Long Id);
//
//	 void deleteProduct(Long id);
//	public Iterable<ProductEntity> getAllProduct();
//	public ProductEntity saveProduct(ProductEntity product);
//	public Optional<ProductEntity> getProductById(Integer productId);
//	
//	void deleteProduct(Integer productId);
	
	
	
	
	

