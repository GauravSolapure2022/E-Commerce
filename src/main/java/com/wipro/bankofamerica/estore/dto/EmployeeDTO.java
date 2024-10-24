package com.wipro.bankofamerica.estore.dto;

import java.util.List;

import lombok.Data;

@Data
public class EmployeeDTO {

	private String firstName;
	private String lastName;
	private  String emailId;
	private  String city;
	
	private List<AddressDTO> addresses;

}
