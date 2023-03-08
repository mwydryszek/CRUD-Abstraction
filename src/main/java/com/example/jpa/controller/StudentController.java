package com.example.jpa.controller;

import com.example.jpa.model.dtos.AddressDTO;
import com.example.jpa.model.dtos.StudentDTO;
import com.example.jpa.service.AddressService;
import com.example.jpa.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/student")
public class StudentController extends BaseController<StudentDTO, StudentService>{

    private final StudentService studentService;

    @Override
    protected StudentService getService() {
        return studentService;
    }
}
