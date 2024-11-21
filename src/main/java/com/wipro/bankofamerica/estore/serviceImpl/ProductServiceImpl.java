package com.wipro.bankofamerica.estore.serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.Exceptions.ProductNotFoundException;
import com.wipro.bankofamerica.estore.dto.Product;
import com.wipro.bankofamerica.estore.model.ProductEntity;
import com.wipro.bankofamerica.estore.repository.ProductRepository;
import com.wipro.bankofamerica.estore.service.ProductService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepo;

	@Override
	public Iterable<Product> getAllProduct() {
		List<ProductEntity> entities = productRepo.findAll();
		return entities.stream().map(entity -> {
			Product product = new Product();
			product.setId(entity.getId());
			product.setProductId(entity.getProductId());
			product.setProductName(entity.getProductName());
			product.setProductDescription(entity.getProductDescription());
			product.setQuantity(entity.getQuantity());
			product.setAmount(entity.getAmount());
			return product;
		}).collect(Collectors.toList());
	}

	@Override
	public List<Product> saveProduct(List<Product> products) {
		// Convert List<Product> to List<ProductEntity>
		List<ProductEntity> productEntities = products.stream().map(product -> {
			ProductEntity entity = new ProductEntity();
			entity.setProductId(product.getProductId());
			entity.setAmount(product.getAmount());
			entity.setProductDescription(product.getProductDescription());
			entity.setProductName(product.getProductName());
			entity.setQuantity(product.getQuantity());
			return entity;
		}).collect(Collectors.toList());

		// Save all entities in a batch
		List<ProductEntity> savedEntities = productRepo.saveAll(productEntities);

		// Convert List<ProductEntity> back to List<Product>
		return savedEntities.stream().map(entity -> {
			Product savedProduct = new Product();
			savedProduct.setId(entity.getId());
			savedProduct.setProductId(entity.getProductId());
			savedProduct.setProductDescription(entity.getProductDescription());
			savedProduct.setAmount(entity.getAmount());
			savedProduct.setQuantity(entity.getQuantity());
			savedProduct.setProductName(entity.getProductName());
			return savedProduct;
		}).collect(Collectors.toList());
	}

	@Override
	public Product getProductById(Integer id) {
		// Fetch the ProductEntity from the repository using the provided ID
		ProductEntity productEntity = productRepo.findByProductId(id).orElse(null);

		// If the ProductEntity is found, convert it to Product
		if (productEntity != null) {
			Product product = new Product();
			product.setId(productEntity.getId());
			product.setProductId(productEntity.getProductId());
			product.setProductName(productEntity.getProductName());
			product.setProductDescription(productEntity.getProductDescription());
			product.setQuantity(productEntity.getQuantity());
			product.setAmount(productEntity.getAmount());
			return product;
		}

		throw new ProductNotFoundException("product id not found" + id);
	}

	@Override
	public void deleteProduct(Integer id) {
		if (productRepo.existsByProductId(id)) {
	   productRepo.deleteByProductId(id);
		} else {
			throw new ProductNotFoundException("Product not found with ID: " + id);
		}
	}

	@Override
	public Product updateProduct(Integer id, Product updatedProduct) {
		ProductEntity existingProductEntity = productRepo.findByProductId(id)
				.orElseThrow(() -> new ProductNotFoundException("Product ID not found"));

		// Update product details
		existingProductEntity.setProductName(updatedProduct.getProductName());
		existingProductEntity.setProductDescription(updatedProduct.getProductDescription());
		existingProductEntity.setQuantity(updatedProduct.getQuantity());
		existingProductEntity.setAmount(updatedProduct.getAmount());

		// Save the updated product entity
		ProductEntity savedEntity = productRepo.save(existingProductEntity);

		// Convert the saved entity back to Product
		Product product = new Product();
		product.setId(savedEntity.getId());
		product.setProductId(savedEntity.getProductId());
		product.setProductName(savedEntity.getProductName());
		product.setProductDescription(savedEntity.getProductDescription());
		product.setQuantity(savedEntity.getQuantity());
		product.setAmount(savedEntity.getAmount());
		return product;
	}

}
