package com.wipro.bankofamerica.estore.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.wipro.bankofamerica.estore.dto.EmployeeDTO;
import com.wipro.bankofamerica.estore.model.EmployeeEntity;


@Mapper(componentModel ="spring")
@Component
public interface EmployeeMapper {


    EmployeeEntity dtoToEntity(EmployeeDTO employeeDTO);


    EmployeeDTO entityToDto(EmployeeEntity employee);
}
