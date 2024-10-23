package com.wipro.bankofamerica.estore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Addresses;


@Service
public interface AddressService {

	
	
	public Addresses saveAddresses(Addresses addresses);

	
//	//List<Address> getAllAddresses();
//
//	public Optional<Address> getAddressById(Long id);
//
//	public void deleteAddress(Long id);

	
}
