package com.example.jpa.model.mappers;

public interface BaseMapper<E,D> {

    E mapToEntity(D dto);
    D mapToDTO(E entity);
}
