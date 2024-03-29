package com.example.jpa.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class AddressDTO{

    private Long id;
    private String country;
    private String city;
    private String street;
    private Integer houseNumber;

}
