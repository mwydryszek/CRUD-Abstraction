package com.example.jpa.service;

import com.example.jpa.model.dtos.AddressDTO;

import java.util.List;

public interface CrudService<D> {

    List<D> get();

    D add(D dto);

    D update(Long id, D dto);

    void delete(Long id);

}
