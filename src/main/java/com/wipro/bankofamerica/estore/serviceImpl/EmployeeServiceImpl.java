package com.wipro.bankofamerica.estore.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Employee;
import com.wipro.bankofamerica.estore.repository.EmployeeRepository;
import com.wipro.bankofamerica.estore.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);

	}

	@Override
	public Employee getEmployeeById(Long id) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(id);
		return optionalEmployee.orElse(null);

	}

	@Override
	public List<Employee> getAllEmployees() {

		return null;
	}

}