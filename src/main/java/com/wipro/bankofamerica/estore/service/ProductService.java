package com.wipro.bankofamerica.estore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Product;
@Service
public interface ProductService {

	List<Product> getAllProducts();

    Product saveProduct(Product product);

    Optional<Product> getProductById(Integer id);

    void deleteProduct(Integer id);
}
	


