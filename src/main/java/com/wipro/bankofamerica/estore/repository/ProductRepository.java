package com.wipro.bankofamerica.estore.repository;

import java.io.Serializable;
import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.bankofamerica.estore.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Serializable>{
	

}
