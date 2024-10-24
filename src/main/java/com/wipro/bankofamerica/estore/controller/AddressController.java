package com.wipro.bankofamerica.estore.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.bankofamerica.estore.dto.AddressDTO;
import com.wipro.bankofamerica.estore.service.AddressService;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping
    public AddressDTO saveAddress(@RequestBody AddressDTO addressDTO) {
        return addressService.saveAddress(addressDTO);
    }
}
