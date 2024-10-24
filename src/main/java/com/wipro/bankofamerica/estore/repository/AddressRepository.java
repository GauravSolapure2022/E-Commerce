package com.wipro.bankofamerica.estore.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.bankofamerica.estore.model.AddressesEntity;

public interface AddressRepository extends JpaRepository<AddressesEntity, Integer> {
}

