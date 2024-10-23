package com.wipro.bankofamerica.estore.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Address;
import com.wipro.bankofamerica.estore.repository.AddressRepo;
import com.wipro.bankofamerica.estore.service.AddressService;

@Service
public class AddressServiceImp implements AddressService {
  
	@Autowired
	private AddressRepo addressRepo;
	
	@Override
	public Address saveAddress(Address address) {
		// TODO Auto-generated method stub
		return addressRepo.save(address);
	}

	@Override
	public List<Address> getAllAddresses() {
		// TODO Auto-generated method stub
		return addressRepo.findAll();
	}

	@Override
	public Optional<Address> getAddressById(Integer id) {
		// TODO Auto-generated method stub
        return addressRepo.findById(id);
	}

	@Override
	public void deleteAddress(Integer id) {
		// TODO Auto-generated method stub
        addressRepo.deleteById(id);

	}

}
