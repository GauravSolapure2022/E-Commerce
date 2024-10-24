package com.wipro.bankofamerica.estore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
private int id;
private int productId;
private String	productName;
private String	productDescription ;	
private int	quantity;
private double	amount;
}
