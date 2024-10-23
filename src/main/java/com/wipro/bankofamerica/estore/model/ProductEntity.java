package com.wipro.bankofamerica.estore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="productId")
	private Integer productId;
	
	@Column(name="ProductName")
	private String productName;
	

	@Column(name="productPrice")
	private Integer productPrice;
	
	
	public ProductEntity() {
		
	}
	
	

	public ProductEntity(Integer productId, String productName, Integer id, Integer price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.id = id;
		this.productPrice = price;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getid() {
		return id;
	}

	public void setid(Integer id) {
		this.id =id;
	}

	public Integer getPrice() {
		return productPrice;
	}

	public void setPrice(Integer price) {
		this.productPrice = price;
	}

	
	
	

}
