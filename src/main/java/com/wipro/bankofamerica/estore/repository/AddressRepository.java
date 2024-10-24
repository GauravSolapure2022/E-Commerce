package com.wipro.bankofamerica.estore.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.bankofamerica.estore.model.Address;

public interface AddressRepository extends JpaRepository< Address, Serializable> {

}
