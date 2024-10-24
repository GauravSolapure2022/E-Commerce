package com.wipro.bankofamerica.estore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankofamerica.estore.model.Employee;
import com.wipro.bankofamerica.estore.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	
	    @Autowired
	    private EmployeeService employeeService;
	 
	    @PostMapping
	    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
	        Employee savedEmployee = employeeService.saveEmployee(employee);
	        return ResponseEntity.ok(savedEmployee);
	    }
	 
	    @GetMapping
	    public ResponseEntity<List<Employee>> getAllEmployees() {
	        List<Employee> employees = employeeService.getAllEmployees();
	        return ResponseEntity.ok(employees);
	    }
	    @GetMapping("/{id}")
	    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
	        Optional<Employee> employee = employeeService.getEmployeeById(id);
	        return employee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }
	 
	   /* @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteEmployee(@PathVariable Integer id) {
	        employeeService.deleteEmployee(id);
	        return ResponseEntity.noContent().build();
	    }
		*/
	
	
	

}
