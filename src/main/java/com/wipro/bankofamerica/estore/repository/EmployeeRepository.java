package com.wipro.bankofamerica.estore.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.bankofamerica.estore.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {

	
}
