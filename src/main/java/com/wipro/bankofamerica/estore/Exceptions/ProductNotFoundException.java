package com.wipro.bankofamerica.estore.Exceptions;

import javax.print.attribute.standard.Media;

import lombok.Data;

@Data
public class ProductNotFoundException extends RuntimeException{

	private String message;

	public  ProductNotFoundException(String message) {
		super();
		this.message=message;
	}
}

