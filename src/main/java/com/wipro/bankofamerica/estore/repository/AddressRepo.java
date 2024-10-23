package com.wipro.bankofamerica.estore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.bankofamerica.estore.model.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
