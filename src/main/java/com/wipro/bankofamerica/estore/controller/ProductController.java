package com.wipro.bankofamerica.estore.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankofamerica.estore.model.Product;
import com.wipro.bankofamerica.estore.service.ProductService;

//import in.atos.jersey.health.insurance.binding.CreateCaseResponse;
import jakarta.persistence.Id;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("product")

public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	//done
	@PostMapping("/")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
		
		    Product savedProduct=productService.saveProduct(product);
		    return ResponseEntity.ok(savedProduct);
	
	}
	
	//done
	 @GetMapping("/{id}")
	    public ResponseEntity<Product> getProductById(@PathVariable Integer id) {
	        Product product = productService.getProductById(id);
	        if (product != null) {
	            return ResponseEntity.ok(product);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	
	//done
	  @GetMapping("/getAllProduct")
	    public ResponseEntity<List<Product>> getAllProducts() {
	        List<Product> products = productService.getAllProduct();
	        return ResponseEntity.ok(products);  // Return the list of products in JSON format
	    }
	  
	  
	  //done
	  @DeleteMapping("/{id}")
	    public ResponseEntity<String> deleteProduct(@PathVariable Integer id) {
	        try {
	        	productService.deleteProduct(id);
	            return ResponseEntity.ok("Record is deleted.");
	        } catch (RuntimeException e) {
	            return ResponseEntity.status(404).body(e.getMessage());
	        }
	    }
	
	  
	  @PutMapping("/update")
	  public ResponseEntity<?> updateProduct(@RequestBody Product product) {
	      // Check if the product with the given ID exists
	      Product existingProduct = productService.getProductById(product.getId());
	      
	      if (existingProduct != null) {
	          // Update the existing product's fields
	          existingProduct.setProductId(product.getProductId());
	          existingProduct.setProductName(product.getProductName());
	          existingProduct.setProductDescription(product.getProductDescription());
	          existingProduct.setQuantity(product.getQuantity());
	          existingProduct.setAmount(product.getAmount());

	          // Save the updated product using the service
	          Product updatedProduct = productService.saveProduct(existingProduct);

	          // Return the updated product as the response
	          return ResponseEntity.ok(updatedProduct);
	      } else {
	          // Return an error response if the product does not exist
	          return ResponseEntity.status(404).body("Product not found with ID: " + product.getId());
	      }
	  }
	
	  
	  
	
}
