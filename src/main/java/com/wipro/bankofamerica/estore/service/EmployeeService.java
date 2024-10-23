package com.wipro.bankofamerica.estore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Employee;

@Service
public interface EmployeeService {
	
 //	Employee saveEmployee(Employee employee);
   // List<Employee> getAllEmployees();
    //Optional<Employee> getEmployeeById(Integer id);
    //void deleteEmployee(Integer id);
	//Employee getEmployeeById(Integer id);

	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployees();

	Optional<Employee> getEmployeeById(Integer id);

	void deleteEmployee(Integer id);
}
