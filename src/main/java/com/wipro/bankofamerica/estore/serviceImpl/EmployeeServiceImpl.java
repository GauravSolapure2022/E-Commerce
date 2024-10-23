package com.wipro.bankofamerica.estore.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.exception.EmployeeAlreadyPresentException;
import com.wipro.bankofamerica.estore.model.Employee;
import com.wipro.bankofamerica.estore.repository.EmployeeRepository;
import com.wipro.bankofamerica.estore.service.EmployeeServiceI;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
			return employeeRepository.save(employee);
		
	}

	@Override
	public Employee getEmployee(Integer id) 
	{
		Optional<Employee> optional = employeeRepository.findById(id);
		if(optional.isPresent())
		{
			return optional.get();
		}
		else
		{
			throw new EmployeeAlreadyPresentException(" Employee is already present ");
		}
		
	}
	
	
	

}
