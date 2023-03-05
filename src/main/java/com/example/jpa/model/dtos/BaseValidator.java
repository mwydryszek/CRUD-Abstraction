package com.example.jpa.model.dtos;

public interface BaseValidator<T> {

    void validate(T dto);

}
