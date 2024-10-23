package com.wipro.bankofamerica.estore.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Employee;
import com.wipro.bankofamerica.estore.repository.EmployeeRepository;
import com.wipro.bankofamerica.estore.service.EmployeeServiceI;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee save = employeeRepository.save(employee);
		return save;
	}

	@Override
	public Employee getEmployee(Integer id) {
		Optional<Employee> byId = employeeRepository.findById(id);
		 if(!byId.isEmpty()) {
			Employee employee = byId.get();
			return employee;
		}
		else {
			throw new RuntimeException("employee id is not found");
		}
	}
	
	
	

}
