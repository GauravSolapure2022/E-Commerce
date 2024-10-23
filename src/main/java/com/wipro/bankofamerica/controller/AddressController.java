package com.wipro.bankofamerica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankofamerica.model.Address;
import com.wipro.bankofamerica.service.AddressService;

@RestController 
@RequestMapping("/Address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@PostMapping("/saveAddress")
	public ResponseEntity<Address>saveAddress(@RequestBody Address address)
	{
		return addressService.saveAddress(address);
	}
	
	@GetMapping("/getAllAddress")
	public ResponseEntity<List<Address>>getAllAddress()
	{
		return addressService.getAllAddress();
	}
	
	@GetMapping("/getAddressById/{aid}")
	public ResponseEntity<Address>getSingleAddress(@PathVariable Integer aid)
	{
		return addressService.getAddressById(aid);
	}
	
	@PutMapping("/updateAddress")
	public ResponseEntity<Address>updateAddress(@RequestBody Address address)
	{
		return addressService.updateAddress(address);
	}
}
