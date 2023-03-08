package com.example.jpa.controller;

import com.example.jpa.model.dtos.AddressDTO;
import com.example.jpa.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/address")
public class AddressController extends BaseController<AddressDTO, AddressService>{

    private final AddressService addressService;


    @Override
    protected AddressService getService() {
        return addressService;
    }
}
