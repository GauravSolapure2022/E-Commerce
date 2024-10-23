package com.wipro.bankofamerica.estore.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Addresses;
import com.wipro.bankofamerica.estore.repository.AddressRepository;
import com.wipro.bankofamerica.estore.service.AddressService;

import jakarta.persistence.SequenceGenerator;


@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public Addresses saveAddresses(Addresses addresses) {
		
		return addressRepository.save(addresses);
		
	
	}
	

//	@Override
//	public Optional<Address> getAddressById(Long id) {
//		
//		return addressRepository.findById(id);
//	}
//
//	@Override
//	public void deleteAddress(Integer id) {
//		// TODO Auto-generated method stub
//		
//	}

}
