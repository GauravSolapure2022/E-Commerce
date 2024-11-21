package com.wipro.bankofamerica.estore.exception;

public class ProductNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public ProductNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	

}
