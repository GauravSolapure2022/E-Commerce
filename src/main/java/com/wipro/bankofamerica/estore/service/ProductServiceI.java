package com.wipro.bankofamerica.estore.service;

import com.wipro.bankofamerica.estore.model.Product;

public interface ProductServiceI {
	public Iterable<Product> getAllProduct();
	public Product saveProduct(Product product);
	public <optional>Product getProductById(Integer Id);
	public void deleteProduct(Integer id);

}
