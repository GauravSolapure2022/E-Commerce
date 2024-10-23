package com.wipro.bankofamerica.estore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.bankofamerica.estore.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

//	Optional<Employee> findByEmployee(String email);

	Optional<Employee> findByemail(String email);

}
