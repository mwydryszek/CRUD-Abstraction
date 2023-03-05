package com.example.jpa;

import com.example.jpa.model.AddressEntity;
import com.example.jpa.model.StudentEntity;
import com.example.jpa.repository.AddressRepository;
import com.example.jpa.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@AllArgsConstructor
@Component
public class DatabaseInitializer {

    private AddressRepository addressRepository;
    private StudentRepository studentRepository;

    //@PostConstruct
    public void initDatabase(){

        AddressEntity addressEntity = AddressEntity.builder()
                .country("Polska")
                .city("Koszalin")
                .street("Morska")
                .houseNumber(123)
                .build();

        addressRepository.save(addressEntity);

        StudentEntity studentEntity = StudentEntity.builder()
                .firstName("Mateusz")
                .lastName("Wydryszek")
                .addressEntity(addressEntity)
                .build();

        studentRepository.save(studentEntity);

    }

}
