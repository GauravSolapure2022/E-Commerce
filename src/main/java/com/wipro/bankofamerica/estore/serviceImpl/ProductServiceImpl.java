package com.wipro.bankofamerica.estore.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.ProductEntity;
import com.wipro.bankofamerica.estore.repository.ProductRepo;
import com.wipro.bankofamerica.estore.service.ProductService;

import jakarta.transaction.Transactional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

	@Override
	public List<ProductEntity> getAllProducts() {
		
		return  productRepo.findAll();
	}

	@Override
	public ProductEntity getProductById(Integer id) {
		 Optional<ProductEntity> product = productRepo.findById(id);
	        return product.orElse(null);
	}

//	@Override
//	public ProductEntity addProduct(ProductEntity product) {
//		
//		return productRepo.save(product);
//	}

	@Override
	public ProductEntity updateProduct(Integer id, ProductEntity product) {
		
		if (productRepo.existsById(id)) {
            product.setid(id);
            return productRepo.save(product);
        } else {
            return null;
        }
	}

	@Override
	@Transactional
	public boolean deleteProduct(Integer id) {
		 
		 if (productRepo.existsById(id)) {
	            productRepo.deleteById(id);
	            return true;
	        } else {
	            return false;
	        }
	}

	@Override
	public ProductEntity saveProduct(ProductEntity productEntity) {
		// TODO Auto-generated method stub
		return productRepo.save(productEntity);
	}

   
}
