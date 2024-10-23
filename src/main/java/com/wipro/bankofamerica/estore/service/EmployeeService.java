package com.wipro.bankofamerica.estore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Employee;

@Service
public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	Optional<Employee> getEmployeeById(Long id);
	
	public List<Employee> getAllEmployees();
	public void deleteEmployee(Long id);
	
}
