package com.example.jpa.service;

import com.example.jpa.model.AddressEntity;
import com.example.jpa.model.dtos.AddressDTO;
import com.example.jpa.model.dtos.AddressValidator;
import com.example.jpa.model.dtos.BaseValidator;
import com.example.jpa.model.mappers.AddressMapper;
import com.example.jpa.model.mappers.BaseMapper;
import com.example.jpa.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService extends AbstractService<AddressEntity, AddressDTO> {

    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;

    @Override
    protected JpaRepository getRepository() {
        return addressRepository;
    }

    @Override
    protected BaseValidator<AddressDTO> getValidator() {
        return new AddressValidator();
    }

    @Override
    protected BaseMapper<AddressEntity, AddressDTO> getMapper() {
        return addressMapper;
    }
}
