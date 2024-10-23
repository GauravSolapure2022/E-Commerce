package com.wipro.bankofamerica.estore.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Employee;
import com.wipro.bankofamerica.estore.repository.EmployeeRepository;
import com.wipro.bankofamerica.estore.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployee(Integer id) {
		 return employeeRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
	}

}
