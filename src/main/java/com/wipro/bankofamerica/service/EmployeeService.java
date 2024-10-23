package com.wipro.bankofamerica.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.model.Address;
import com.wipro.bankofamerica.model.Employee;

@Service
public interface EmployeeService {

	ResponseEntity<Employee> saveEmployee(Employee employee);

	ResponseEntity<List<Employee>> getAllEmployee();

	ResponseEntity<Employee> getSingleEmployeeById(Integer eid);

	String deleteEmployeeByid(Integer eid);

	ResponseEntity<Employee> updateEmployee(Employee employee);

	

	

}
