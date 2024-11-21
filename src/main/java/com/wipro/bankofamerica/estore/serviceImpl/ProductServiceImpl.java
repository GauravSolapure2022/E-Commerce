package com.wipro.bankofamerica.estore.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Product;
import com.wipro.bankofamerica.estore.exception.ProductNotFoundException;
import com.wipro.bankofamerica.estore.repository.ProductRepository;
import com.wipro.bankofamerica.estore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productrepository; 

	@Override
	public Product saveProduct(Product product) {
		
		return productrepository.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
	
		return productrepository.findAll();
	}

//	@Override
//	public Optional<Product> getProductById(Long id) throws Exception {
//	    if (id == null) {
//	        throw new IllegalArgumentException("Product ID cannot be null.");
//	    }
//
//	    Optional<Product> product = productrepository.findById(id);
//	    if (product.isPresent()) {
//	        return product;
//	    } else {
//	        throw new ProductNotFoundException("Product ID :: " + id + " not found.");
//	    }
//	}


	@Override
	public void deleteProduct(Integer id) {
		productrepository.deleteById(id);
		
	}

	@Override
	public Optional<Product> getProductById(Integer id) throws Exception{
	    if (id == null) {
        throw new IllegalArgumentException("Product ID cannot be null.");
    }

    Optional<Product> product = productrepository.findById(id);
    if (product.isPresent()) {
        return product;
    } else {
        throw new ProductNotFoundException("Product ID :: " + id + " not found.");
    }
	}

	@Override
	public Product updateProduct(Product product) {
		
		return null;
	}

}
