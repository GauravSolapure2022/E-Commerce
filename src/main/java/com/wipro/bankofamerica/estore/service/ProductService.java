package com.wipro.bankofamerica.estore.service;

import java.util.List;
import java.util.Optional;

import com.wipro.bankofamerica.estore.model.ProductEntity;



public interface ProductService {

	public List<ProductEntity> getAllProduct();
	public ProductEntity saveProduct(ProductEntity productEntity);
	public <optional>Optional<ProductEntity> getProductById(Long Id);
	
	boolean deleteProduct(Long productId);
	//boolean deleteProduct(Integer id);
	ProductEntity updateProduct(Integer id, ProductEntity product);

	
	
}
