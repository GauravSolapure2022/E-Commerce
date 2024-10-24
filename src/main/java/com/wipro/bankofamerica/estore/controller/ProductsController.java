package com.wipro.bankofamerica.estore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankofamerica.estore.Exceptions.ProductNotFoundException;
import com.wipro.bankofamerica.estore.dto.Product;
import com.wipro.bankofamerica.estore.service.ProductService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ProductsController {
	@Autowired
	private ProductService productService;

	@PostMapping("/product/addproduct")
	public List<Product> addProducts(@RequestBody List<Product> products) {
		return productService.saveProduct(products);
	}

	@GetMapping("/product/getproduct/{productId}")
	public ResponseEntity<Product> getProductById(@PathVariable Integer productId) {
		try {
			Product product = productService.getProductById(productId);
			return ResponseEntity.ok(product);
		} catch (ProductNotFoundException ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}

	@GetMapping(path = "/product/allproducts")
	public Iterable<Product> getAllProducts() {
		return productService.getAllProduct();
	}

	@DeleteMapping("/product/delete/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable Integer productId) {
		try {
			productService.deleteProduct(productId);
			return ResponseEntity.ok("Product deleted successfully.");
		} catch (ProductNotFoundException ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
		}
	}

	@PutMapping("/product/update/{productId}")
	public ResponseEntity<Product> updateProduct(@PathVariable Integer productId, @RequestBody Product product) {
		try {
			Product updatedProduct = productService.updateProduct(productId, product);
			return ResponseEntity.ok(updatedProduct);
		} catch (ProductNotFoundException ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}
}