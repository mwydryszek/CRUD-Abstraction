package com.example.jpa.controller;

import com.example.jpa.model.dtos.AddressDTO;
import com.example.jpa.service.AbstractService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<D, S extends AbstractService>{

    protected abstract S getService();

    @GetMapping("/all")
    public List<D> getAll() {
        return getService().get();
    }

    @PostMapping
    public D add(@RequestBody D dto) {
        return (D) getService().add(dto);
    }

    @PutMapping("/{id}")
    public D update(@PathVariable("id") Long id, @RequestBody D dto) {
        return (D) getService().update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
            getService().delete(id);
    }

}
