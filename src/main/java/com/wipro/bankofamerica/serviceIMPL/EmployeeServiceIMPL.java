package com.wipro.bankofamerica.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.model.Address;
import com.wipro.bankofamerica.model.Employee;
import com.wipro.bankofamerica.repositry.EmployeeRepeositry;
import com.wipro.bankofamerica.service.EmployeeService;

@Service
public class EmployeeServiceIMPL implements EmployeeService {
	
	@Autowired
	private EmployeeRepeositry employeeRepo;

	@Override
	public ResponseEntity<Employee> saveEmployee(Employee employee) {
		
		if (employeeRepo.existsById(employee.getEid())) 
		{
			return new ResponseEntity<Employee>(employee, HttpStatus.ALREADY_REPORTED);
		}
		
		else {
			return new ResponseEntity<Employee>(employeeRepo.save(employee), HttpStatus.CREATED);
		}
		
		
	}

	@Override
	public ResponseEntity<List<Employee>> getAllEmployee() {
		
		return new ResponseEntity<List<Employee>>(employeeRepo.findAll(),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Employee> getSingleEmployeeById(Integer eid) {
		
		if (employeeRepo.existsById(eid)) 
		{
			return new ResponseEntity<Employee>(employeeRepo.findById(eid).get() ,HttpStatus.ACCEPTED);
		}
		
		else {
			return new ResponseEntity<Employee>(new Employee(), HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public String deleteEmployeeByid(Integer eid) {
		
		Optional<Employee>optional=employeeRepo.findById(eid);
		
		if (optional.isPresent())
		{
			employeeRepo.deleteById(eid);
			
			return "Employee Information has been Deleted:"+eid;
		}
		
		else {
			return "Employee Id  is Not Present in list:"+eid;
		}
		
	}

	@Override
	public ResponseEntity<Employee> updateEmployee(Employee employee) {
		
		if (employeeRepo.existsById(employee.getEid())) 
		{
			employeeRepo.save(employee);
			return new ResponseEntity<Employee>(employeeRepo.save(employee),HttpStatus.CREATED);
		}
		
		else {
			return new ResponseEntity<Employee>(employee,HttpStatus.CONFLICT);
		}
	}
}

