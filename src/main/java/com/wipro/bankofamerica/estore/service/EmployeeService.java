package com.wipro.bankofamerica.estore.service;

import java.util.List;

import com.wipro.bankofamerica.estore.model.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);

	public Employee getEmployeeById(Long id);

	public List<Employee> getAllEmployees();

}
