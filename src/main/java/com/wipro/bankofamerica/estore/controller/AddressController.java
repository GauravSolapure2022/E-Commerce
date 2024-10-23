package com.wipro.bankofamerica.estore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankofamerica.estore.model.Address;
import com.wipro.bankofamerica.estore.service.AddressService;

@RestController
@RequestMapping("/Address")
public class AddressController {
	 
	@Autowired
	private AddressService addressService;
	
	@PostMapping
	public ResponseEntity<Address> createAddress(@RequestBody Address address){
		Address add=addressService.saveAddress(address);
		return ResponseEntity.ok(add);
		
	}
	
	@GetMapping
	public ResponseEntity<List<Address>> getAllAddresses(){
		List<Address> add =addressService.getAllAddresses();
		return ResponseEntity.ok(add) ;
		
	}
	
	@GetMapping("/id")
	public ResponseEntity<Address> getAddressById(@PathVariable Integer id){
	Optional<Address> add= addressService.getAddressById(id);
	
		return add.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/id")
	public ResponseEntity<Void>  deleteAddress(@PathVariable Integer id){
		addressService.deleteAddress(id);
		return ResponseEntity.noContent().build();
		
	}
	
	

}
