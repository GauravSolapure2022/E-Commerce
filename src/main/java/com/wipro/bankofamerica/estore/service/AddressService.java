package com.wipro.bankofamerica.estore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Address;

@Service
public interface AddressService {

	Address saveAddress(Address address);
    List<Address> getAllAddresses();
    Optional<Address> getAddressById(Integer id);
    void deleteAddress(Integer id);
}
