package com.wipro.bankofamerica.estore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankofamerica.estore.model.Employee;
import com.wipro.bankofamerica.estore.service.EmployeeService;

@RestController
public class EmployeeController {
	
	    @Autowired
	    private EmployeeService employeeService;

	    @PostMapping("/saveEmployee")
	    public Employee saveEmployee(@RequestBody Employee employee) {
	        return employeeService.saveEmployee(employee);
	    }

	    @GetMapping("/{id}")
	    public Employee getEmployee(@PathVariable Integer id) {
	        return employeeService.getEmployee(id);
	    }
	

}
