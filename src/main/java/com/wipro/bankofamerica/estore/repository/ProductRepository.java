package com.wipro.bankofamerica.estore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.bankofamerica.estore.model.ProductEntity;
import java.util.List;
import java.util.Optional;


@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
	  Optional<ProductEntity> findByProductId(int productId);
	  boolean  existsByProductId(int productId);
	  void	deleteByProductId(int productId);
}
