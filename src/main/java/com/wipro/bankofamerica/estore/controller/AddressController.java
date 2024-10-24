package com.wipro.bankofamerica.estore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankofamerica.estore.model.Address;
import com.wipro.bankofamerica.estore.service.AddressService;
import com.wipro.bankofamerica.estore.service.EmployeeService;



@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
    private AddressService addressService;
	
	@PostMapping("address")
    public Address createAddress(@RequestBody Address address) {
        return addressService.saveAddress(address);
	}

}
