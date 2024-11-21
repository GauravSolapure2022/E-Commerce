package com.wipro.bankofamerica.estore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.bankofamerica.estore.model.ProductEntity;



public interface ProductRepository extends JpaRepository<ProductEntity, Long>{

	public Optional<ProductEntity> getProductById(Long productId);

	//public void deleteProduct(Long productId);

	//void deleteById(Long productId);
	
	Optional<ProductEntity> findById(Long productId);

	public boolean existsById(Integer id);


	


}
