package com.wipro.bankofamerica.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.bankofamerica.model.Product;

@Repository
public interface ProductRepositry extends JpaRepository<Product, Integer>{

}
