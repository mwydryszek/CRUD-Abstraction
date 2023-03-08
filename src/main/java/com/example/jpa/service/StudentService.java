package com.example.jpa.service;

import com.example.jpa.model.StudentEntity;
import com.example.jpa.model.dtos.*;
import com.example.jpa.model.mappers.BaseMapper;
import com.example.jpa.model.mappers.StudentMapper;
import com.example.jpa.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService extends AbstractService<StudentEntity, StudentDTO>{

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    protected JpaRepository getRepository() {
        return studentRepository;
    }

    @Override
    protected BaseValidator<StudentDTO> getValidator() {
        return new StudentValidator();
    }

    @Override
    protected BaseMapper<StudentEntity, StudentDTO> getMapper() {
        return studentMapper;
    }
}
