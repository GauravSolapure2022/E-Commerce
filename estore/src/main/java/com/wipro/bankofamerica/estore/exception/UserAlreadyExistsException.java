package com.wipro.bankofamerica.estore.exception;

public class UserAlreadyExistsException extends RuntimeException
{
	private String message ;

	public UserAlreadyExistsException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	
	
	
}
