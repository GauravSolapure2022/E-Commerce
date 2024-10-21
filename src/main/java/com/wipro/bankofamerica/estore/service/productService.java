package com.wipro.bankofamerica.estore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Product;

@Service
public interface productService {
	
	
    List<Product> getAllProduct(); //Returns all products.

    Product saveProduct(Product product); //Saves a given product and returns the saved product.

    Product getProductById(Integer id); //Fetches a product by ID.

    void deleteProduct(Integer id); //Deletes a product by ID.
	

}
