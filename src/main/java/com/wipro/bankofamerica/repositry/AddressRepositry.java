package com.wipro.bankofamerica.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.bankofamerica.model.Address;

@Repository
public interface AddressRepositry extends JpaRepository<Address, Integer>{

}
