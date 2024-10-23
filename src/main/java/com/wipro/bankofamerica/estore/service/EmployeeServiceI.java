package com.wipro.bankofamerica.estore.service;

import com.wipro.bankofamerica.estore.model.Employee;

public interface EmployeeServiceI {

	public Employee saveEmployee(Employee employee);
	public abstract Employee getEmployee(Integer id);

}
