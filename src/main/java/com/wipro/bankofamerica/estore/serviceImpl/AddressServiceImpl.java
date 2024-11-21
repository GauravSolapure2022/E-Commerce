package com.wipro.bankofamerica.estore.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.bankofamerica.estore.model.Address;
import com.wipro.bankofamerica.estore.repository.AddressRepository;
import com.wipro.bankofamerica.estore.service.AddressService;

public class AddressServiceImpl implements AddressService {

	
	@Autowired
	private AddressRepository addressRepository;
	@Override
    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Optional<Address> getAddressById(Integer id) {
        return addressRepository.findById(id);
    }

    @Override
    public void deleteAddress(Integer id) {
        addressRepository.deleteById(id);
    }
	}
	


