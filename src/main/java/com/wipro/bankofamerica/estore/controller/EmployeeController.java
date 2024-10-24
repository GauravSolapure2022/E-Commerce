package com.wipro.bankofamerica.estore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankofamerica.estore.dto.EmployeeDTO;
import com.wipro.bankofamerica.estore.service.EmployeeServie;

@RestController
public class EmployeeController {

	@Autowired
	private	EmployeeServie employeeService;
	
	@PostMapping(path="estore/employee/saveemployee")
		public EmployeeDTO saveEmployee(@RequestBody EmployeeDTO employee) {
		return employeeService.saveEmployee(employee);
	 
	}

    @GetMapping("/{id}")
    public EmployeeDTO getEmployee(@PathVariable Integer id) {
        return employeeService.getEmployee(id);
}
}
