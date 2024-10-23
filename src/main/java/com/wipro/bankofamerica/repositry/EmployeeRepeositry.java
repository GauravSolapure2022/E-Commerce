package com.wipro.bankofamerica.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.bankofamerica.model.Employee;

@Repository
public interface EmployeeRepeositry extends JpaRepository<Employee, Integer> {
	

}
