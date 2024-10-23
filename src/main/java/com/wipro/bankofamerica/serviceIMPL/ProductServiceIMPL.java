package com.wipro.bankofamerica.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.model.Product;
import com.wipro.bankofamerica.model.User;
import com.wipro.bankofamerica.repositry.ProductRepositry;
import com.wipro.bankofamerica.service.ProductService;

@Service
public class ProductServiceIMPL implements ProductService{
	
	@Autowired
	private ProductRepositry productrepo;

	@Override
	public ResponseEntity<Product> saveProduct(Product product) {
	
		if (productrepo.existsById(product.getPid())) 
		{
			return new ResponseEntity<Product>(product ,  HttpStatus.ALREADY_REPORTED);
		}
		
		else {
			return new ResponseEntity<Product>(productrepo.save(product), HttpStatus.CREATED);
		}
	}

	@Override
	public ResponseEntity<List<Product>> getAllProduct() {
		 
		return new ResponseEntity<List<Product>>(productrepo.findAll(),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Product> getProductById(Integer pid) {
	
		if (productrepo.existsById(pid)) 
		{
			return new ResponseEntity<Product>(productrepo.findById(pid).get(), HttpStatus.ACCEPTED);
		}
		
		else 
		{
			return new ResponseEntity<Product>(new Product(), HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public String deleteProductByid(Integer pid) {
		
		Optional<Product>optional=productrepo.findById(pid);
		if (optional.isPresent()) 
		{
			  productrepo.deleteById(pid);
			
			  return "product will be deleted"+pid;
		}
		
		else {
			
			return "this product id is not in list:"+pid;
		}
	}

	@Override
	public ResponseEntity<Product> updateProduct(Product product) {
		

		  if(productrepo.existsById(product.getPid()))
	      {
	    	  productrepo.save(product);
	    	  return new ResponseEntity<Product>(productrepo.save(product), HttpStatus.CREATED);
	      }
	      
	      else {
			 return new ResponseEntity<Product>(product, HttpStatus.CONFLICT);
		}
	}
		


	
}	
	
	
	


