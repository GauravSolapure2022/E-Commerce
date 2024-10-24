package com.wipro.bankofamerica.estore.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.dto.EmployeeDTO;
import com.wipro.bankofamerica.estore.mapper.EmployeeMapper;
import com.wipro.bankofamerica.estore.model.EmployeeEntity;
import com.wipro.bankofamerica.estore.repository.EmployeeRepository;
import com.wipro.bankofamerica.estore.service.EmployeeServie;

@Service
public class EmployyeServiceimpl implements EmployeeServie {
	 @Autowired
	    private EmployeeRepository employeeRepository;

	 @Autowired
	    private EmployeeMapper employeeMapper;
	
	@Override
	public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
		   EmployeeEntity employee = employeeMapper.dtoToEntity(employeeDTO);
	        EmployeeEntity savedEmployee = employeeRepository.save(employee);
	        return employeeMapper.entityToDto(savedEmployee);
	}

	@Override
	public EmployeeDTO getEmployee(Integer id) {
	    EmployeeEntity employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
        return employeeMapper.entityToDto(employee);
	}

}
