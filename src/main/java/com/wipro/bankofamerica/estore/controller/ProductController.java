package com.wipro.bankofamerica.estore.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wipro.bankofamerica.estore.model.Product;
import com.wipro.bankofamerica.estore.service.ProductService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;


	@PostMapping("/createProduct")
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		try {
		Product savedProduct = productService.saveProduct(product);
		return ResponseEntity.ok(savedProduct);

		}
		catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
		
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Integer id) {
		Product product = productService.getProductById(id);
		if (product != null) {
			return ResponseEntity.ok(product);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/getAllProduct")
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> products = productService.getAllProduct();
		return ResponseEntity.ok(products);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable Integer id) {
		try {
			productService.deleteProduct(id);
			return ResponseEntity.ok("Record is deleted.");
		} catch (RuntimeException e) {
			return ResponseEntity.status(404).body(e.getMessage());
		}
	}

	@PutMapping("/updateProduct")
	public ResponseEntity<?> updateProduct(@RequestBody Product product) {
		Product existingProduct = productService.getProductById(product.getId());
		if (existingProduct != null) {
			existingProduct.setProductId(product.getProductId());
			existingProduct.setProductName(product.getProductName());
			existingProduct.setProductDescription(product.getProductDescription());
			existingProduct.setQuantity(product.getQuantity());
			existingProduct.setAmount(product.getAmount());
			Product updatedProduct = productService.saveProduct(existingProduct);
			return ResponseEntity.ok(updatedProduct);
		} else {
			return ResponseEntity.status(404).body("Product not found with ID: " + product.getId());
		}
	}

}