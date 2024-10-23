package com.wipro.bankofamerica.estore.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Address;
import com.wipro.bankofamerica.estore.repository.AddressRepository;
import com.wipro.bankofamerica.estore.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{

	

	 @Autowired
	    private AddressRepository addressRepository;
	
	@Override
	public Address saveAddress(Address address) {
		// TODO Auto-generated method stub
		return addressRepository.save(address);
	}

	
	
	
    
}
