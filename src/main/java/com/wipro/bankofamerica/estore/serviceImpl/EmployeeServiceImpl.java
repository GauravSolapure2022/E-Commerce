package com.wipro.bankofamerica.estore.serviceImpl;

import com.wipro.bankofamerica.estore.model.Employee;
import com.wipro.bankofamerica.estore.repository.EmployeeRepo;
import com.wipro.bankofamerica.estore.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(Integer id) {
        return Optional.ofNullable(employeeRepository.findById(id)
                .orElseThrow());
    }

    @Override
    public void deleteEmployee(Integer id) {
        //if (!employeeRepository.existsById(id)) {
      //      throw new EmployeeNotFoundException(id);
     //   }
        employeeRepository.deleteById(id);
    }

	
	
}
