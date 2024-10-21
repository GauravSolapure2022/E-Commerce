package com.wipro.bankofamerica.estore.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.ProductEntity;
import com.wipro.bankofamerica.estore.repository.ProductRepository;
import com.wipro.bankofamerica.estore.service.ProductService;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	
	@Override
	public List<ProductEntity> getAllProduct() {
		
		List<ProductEntity> productList=new ArrayList<>();
		
		
		return productRepository.findAll();
	}

	@Override
	public ProductEntity saveProduct(ProductEntity productEntity) {
	
		return productRepository.save(productEntity);
	
	}

	@Override
	public Optional<ProductEntity> getProductById(Long productId) {
		
		return productRepository.getProductById(productId);
		
		
	}

//	@Override
//	@Transactional
//	public void deleteProduct(Long productId) {
//	
//		productRepository.getProductById(productId);
//		
//	}

	
//	@Override
//	@Transactional
//	public void deleteProduct(Long productId) {
//	    Optional<ProductEntity> productEntity = productRepository.findById(productId);
//	    
//	    if (productEntity.isPresent()) {
//	        // If the product exists, delete it
//	        productRepository.deleteById(productId);
//	    } else {
//	        // Handle the case where the product does not exist
//	        throw new EntityNotFoundException("Product not found with ID: " + productId);
//	    }
//	}
	
	@Override
	@Transactional
	public boolean deleteProduct(Long productId) {
		 if (productRepository.existsById(productId)) {
	            productRepository.deleteById(productId);
	            return true;
	        } else {
	            return false;
	        }
	}

	
	@Override
	public ProductEntity updateProduct(Integer productId, ProductEntity product) {
		if (productRepository .existsById(productId)) {
            product.setId(productId);
            return productRepository.save(product);
        } else {
            return null;
        }
	}
	
	
}
