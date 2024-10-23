package com.wipro.bankofamerica.estore.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Product;
import com.wipro.bankofamerica.estore.repository.ProductRepository;
import com.wipro.bankofamerica.estore.service.ProductService;

@Service 
public class ProductServiceImpl implements ProductService{

	@Autowired 
	private ProductRepository productrepository;
	
	
	@Override
	public Iterable<Product> getAllProduct() {
		return productrepository.findAll();
	}

	@Override
	public Product saveProduct(Product product) {
		
		return productrepository.save(product);
	}

	@Override
	public Optional<Product> getProductById(Long id) {
		
		return productrepository.findById(id);
	}

	@Override
	public void deleteProduct(Long id) {
		
		productrepository.deleteById(id);
	}
	
	@Override
    public Product updateProduct( Product productDetails) {
    	
		return productrepository.save(productDetails);
    	
    }
	
	
	

}
