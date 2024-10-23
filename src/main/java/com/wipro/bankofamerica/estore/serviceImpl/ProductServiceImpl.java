package com.wipro.bankofamerica.estore.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Product;
import com.wipro.bankofamerica.estore.repository.ProductRepository;
import com.wipro.bankofamerica.estore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	
	@Autowired
	private ProductRepository ProductRepository;

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return ProductRepository.findAll();
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return ProductRepository.save(product);
	}

	@Override
	public Product getProductById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Product> product =  ProductRepository.findById(id);
		return product.orElse(null);
		//return product.orElse(null);
	}

	 @Override
	    public void deleteProduct(Integer id) {
	        if (ProductRepository.existsById(id)) {
	            ProductRepository.deleteById(id);  // Deletes the product by ID
	        } else {
	            throw new RuntimeException("Product not found with ID: " + id);
	        }
	    }

	

	

	

}
