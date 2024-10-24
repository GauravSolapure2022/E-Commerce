package com.wipro.bankofamerica.estore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.bankofamerica.estore.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
