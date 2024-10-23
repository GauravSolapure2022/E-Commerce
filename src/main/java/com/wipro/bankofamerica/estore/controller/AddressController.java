package com.wipro.bankofamerica.estore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankofamerica.estore.serviceImpl.AddressServiceImpl;

@RestController
public class AddressController {
	
	@Autowired
	AddressServiceImpl addressServiceImpl;
	
	

}
