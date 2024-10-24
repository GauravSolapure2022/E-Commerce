package com.wipro.bankofamerica.estore.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.bankofamerica.estore.model.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
}
