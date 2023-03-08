package com.example.jpa.service;

import com.example.jpa.model.mappers.BaseMapper;
import com.example.jpa.model.dtos.BaseValidator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractService<E, D> implements CrudService<D> {

    protected abstract JpaRepository getRepository();
    protected abstract BaseValidator<D> getValidator();
    protected abstract BaseMapper<E, D> getMapper();

    @Override
    public List<D> get() {
        return (List<D>) getRepository().findAll().stream()
                //.map(getMapper()::mapToDTO)
                .collect(Collectors.toList());
    }
    @Override
    public D add(D dto) {
        E entity = (E) getRepository().save(getMapper().mapToEntity(dto));
        return getMapper().mapToDTO(entity);
    }

    @Override
    public D update(Long id, D dto) {
        //dto.setId(id);
        getRepository().delete(id);
        E entity = (E) getRepository().save(getMapper().mapToEntity(dto));
        return getMapper().mapToDTO(entity);
    }

    @Override
    public void delete(Long id) {
        getRepository().deleteById(id);
    }

}
