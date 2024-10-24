package com.wipro.bankofamerica.estore.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.wipro.bankofamerica.estore.dto.AddressDTO;
import com.wipro.bankofamerica.estore.model.AddressesEntity;

@Mapper(componentModel = "spring")
@Component
public interface AddressMapper {
  AddressesEntity dtoToEntity(AddressDTO addressDTO);

    AddressDTO entityToDto(AddressesEntity address);
}
