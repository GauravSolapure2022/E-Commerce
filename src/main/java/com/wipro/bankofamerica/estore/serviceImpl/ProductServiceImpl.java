package com.wipro.bankofamerica.estore.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Product;
import com.wipro.bankofamerica.estore.repository.ProductRepository;
import com.wipro.bankofamerica.estore.service.ProductServiceI;

@Service
public class ProductServiceImpl  implements ProductServiceI{
	@Autowired
	ProductRepository productRepository;
	

	@Override
	public Iterable<Product> getAllProduct() {
		Iterable<Product> all = productRepository.findAll();
		return all;
	}

	@Override
	public Product saveProduct(Product product) {
		Product save = productRepository.save(product);
		
		return save;
	}

	@Override
	public <optional> Product getProductById(Integer Id) {
		Optional<Product> byId = productRepository.findById(Id);
		if(!byId.isEmpty())
		{
			Product product = byId.get();

			return product;
		}
		else {
			throw new RuntimeException("Product not found");
		}
	}

	@Override
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
		
	}

}
