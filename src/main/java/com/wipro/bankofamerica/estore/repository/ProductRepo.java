package com.wipro.bankofamerica.estore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.bankofamerica.estore.model.ProductEntity;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Long> {

	Optional <ProductEntity>getProductById(Integer productId);

//	void deleteProduct(Integer Id);

	boolean existsById(Integer id);

	void deleteById(Integer id);

	Optional<ProductEntity> findById(Integer id);

	
	
	

}
