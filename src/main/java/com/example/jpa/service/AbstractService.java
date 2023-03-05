package com.example.jpa.service;

import com.example.jpa.model.mappers.BaseMapper;
import com.example.jpa.model.dtos.BaseValidator;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractService<E, D> {

    protected abstract JpaRepository getRepository();
    protected abstract BaseValidator<D> getValidator();
    protected abstract BaseMapper<E, D> getMapper();

}
