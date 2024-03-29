package com.example.jpa.model.mappers;


import com.example.jpa.model.StudentEntity;
import com.example.jpa.model.dtos.StudentDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {BaseMapper.class})
public interface StudentMapper extends BaseMapper<StudentEntity, StudentDTO>{

}
