package com.wipro.bankofamerica.estore.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.bankofamerica.estore.model.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Serializable> {
	
	Optional<Product> findById(Integer id);

	
	
	

}
