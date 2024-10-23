package com.wipro.bankofamerica.estore.service;

import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Address;


@Service
public interface AddressService {
	
	public Address saveAddress(Address address);

}
