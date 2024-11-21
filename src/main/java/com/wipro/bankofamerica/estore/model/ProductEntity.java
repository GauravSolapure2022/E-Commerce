package com.wipro.bankofamerica.estore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="products")
public class ProductEntity {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
private int productId;
private String	productName;
private String	productDescription ;
private int	quantity;
private double	amount;

}
