package com.wipro.bankofamerica.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.model.Address;
import com.wipro.bankofamerica.repositry.AddressRepositry;
import com.wipro.bankofamerica.service.AddressService;

@Service
public class AddressServiceIMPL implements AddressService {

	@Autowired
	private AddressRepositry addressRepo;
	
	@Override
	public ResponseEntity<Address> saveAddress(Address address) {
	
		 return new ResponseEntity<Address>(addressRepo.save(address), HttpStatus.CREATED);
				 
	}

	@Override
	public ResponseEntity<List<Address>> getAllAddress() {
		
		return new ResponseEntity<List<Address>>(addressRepo.findAll(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Address> getAddressById(Integer aid) {
		
		if (addressRepo.existsById(aid)) 
		{
			return new ResponseEntity<Address>(addressRepo.findById(aid).get(),HttpStatus.OK);
		}
		
		else {
			
			return new ResponseEntity<Address>(new Address(), HttpStatus.BAD_REQUEST);
		}
		
	}

	

	@Override
	public ResponseEntity<Address> updateAddress(Address address) {
		
		if (addressRepo.existsById(address.getAid())) 
		{
			addressRepo.save(address);
			return new ResponseEntity<Address>(addressRepo.save(address),HttpStatus.CREATED);
		}
		
		else {
			
			return new ResponseEntity<Address>(new Address(), HttpStatus.CONFLICT);
		}
	}
	
	
	
	
}
