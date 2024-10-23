package com.wipro.bankofamerica.estore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.wipro.bankofamerica.estore.model.Employee;
import com.wipro.bankofamerica.estore.serviceImpl.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		Employee saveEmployee = employeeServiceImpl.saveEmployee(employee);
		return saveEmployee;
	}
	
	@GetMapping("/Employee/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		Employee employee = employeeServiceImpl.getEmployee(id);
		return employee;
	}
	
	
	

}
