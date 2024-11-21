package com.wipro.bankofamerica.estore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankofamerica.estore.model.ProductEntity;
import com.wipro.bankofamerica.estore.service.ProductService;





@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	
	
	@GetMapping
    public List<ProductEntity> getAllProducts() {
        return productService.getAllProduct();
    }
	
	
	@GetMapping("/{Id}")
	public ResponseEntity<ProductEntity>  getProductById(@PathVariable Long productId){
		
		Optional<ProductEntity> product=productService.getProductById(productId);
		
		return product.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	
		
	}
	
	
	@PostMapping
	ResponseEntity<ProductEntity> saveProduct(@RequestBody ProductEntity productEntity){
		
		ProductEntity savedProduct=productService.saveProduct(productEntity);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
		
		
	}

	
	@DeleteMapping("/{productId}")
	public ResponseEntity<Void> delete(@PathVariable Long productId){
	    Optional<ProductEntity> productEntity = productService.getProductById(productId);
	    if (productEntity.isPresent()) {
	        productService.deleteProduct(productId);  // Ensure this calls the correct method
	        return ResponseEntity.noContent().build();
	    } else {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	    }
	}

	  // Update an existing product
    @PutMapping("/{id}")
    public ResponseEntity<ProductEntity> updateProduct(@PathVariable Integer id, @RequestBody ProductEntity product) {
        ProductEntity updatedProduct = productService.updateProduct(id, product);
        if (updatedProduct != null) {
            return ResponseEntity.ok(updatedProduct);
        } else {
            return ResponseEntity.notFound().build();
        }
    }	
	
	
	}
	

