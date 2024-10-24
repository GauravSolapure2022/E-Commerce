package com.wipro.bankofamerica.estore.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.dto.AddressDTO;
import com.wipro.bankofamerica.estore.mapper.AddressMapper;
import com.wipro.bankofamerica.estore.model.AddressesEntity;
import com.wipro.bankofamerica.estore.repository.AddressRepository;
import com.wipro.bankofamerica.estore.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{


    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private AddressMapper addressMapper;


	@Override
	public AddressDTO saveAddress(AddressDTO addressDTO) {
		  AddressesEntity address = addressMapper.dtoToEntity(addressDTO);
	        AddressesEntity savedAddress = addressRepository.save(address);
	        return addressMapper.entityToDto(savedAddress);
	}

}
