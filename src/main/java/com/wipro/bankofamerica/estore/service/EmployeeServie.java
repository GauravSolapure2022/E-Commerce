package com.wipro.bankofamerica.estore.service;

import com.wipro.bankofamerica.estore.dto.EmployeeDTO;

public interface EmployeeServie {
	  EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);
	    EmployeeDTO getEmployee(Integer id);
}
