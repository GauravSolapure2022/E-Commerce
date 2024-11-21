package com.wipro.bankofamerica.estore.service;

import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.Employee;

@Service 
public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	
    public Employee getEmployee(Integer id);
    
    public void deleteEmployee(Integer id);

}
