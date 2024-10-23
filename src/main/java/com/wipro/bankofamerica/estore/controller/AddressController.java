package com.wipro.bankofamerica.estore.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankofamerica.estore.model.Address;
import com.wipro.bankofamerica.estore.service.AddressService;



@RestController
@RequestMapping("/addresses")
public class AddressController {
	
	 @Autowired
	    private AddressService addressService;

	    // Save a new address
	    @PostMapping("/saveAddress")
	    public Address saveAddress(@RequestBody Address address) {
	        return addressService.saveAddress(address);
	    }

	

}
