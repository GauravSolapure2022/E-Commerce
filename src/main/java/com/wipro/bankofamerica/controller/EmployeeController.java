package com.wipro.bankofamerica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankofamerica.model.Address;
import com.wipro.bankofamerica.model.Employee;
import com.wipro.bankofamerica.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<Employee>saveEmployee(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);
		
	}
	
	@GetMapping("/getAllEmployee")
	public ResponseEntity<List<Employee>>getAllEmployee()
	{
		return employeeService.getAllEmployee();
	}
		
	@GetMapping("/getSingleEmployeeById/{eid}")
	public ResponseEntity<Employee>getSinglEmployeeById(@PathVariable Integer eid)
	{
		return employeeService.getSingleEmployeeById(eid);
	}
	
	@DeleteMapping("/deleteEmployeeByid/{eid}")
	public String deleteEmployeeByid(@PathVariable Integer eid)
	{
		return employeeService.deleteEmployeeByid(eid);
	}
	
	@PutMapping("/updateEmployee")
	public ResponseEntity<Employee>updateEmployee(@RequestBody Employee employee)
	{
		return employeeService.updateEmployee(employee);
	}

}
