package com.wipro.bankofamerica.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.model.Address;

@Service
public interface AddressService {

	ResponseEntity<Address> saveAddress(Address address);

	ResponseEntity<List<Address>> getAllAddress();

	ResponseEntity<Address> getAddressById(Integer aid);

	ResponseEntity<Address> updateAddress(Address address);

	

}
