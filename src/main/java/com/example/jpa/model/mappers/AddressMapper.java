package com.example.jpa.model.mappers;


import com.example.jpa.model.AddressEntity;
import com.example.jpa.model.dtos.AddressDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper extends BaseMapper<AddressEntity, AddressDTO>{


}
