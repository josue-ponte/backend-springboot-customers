package com.jponte.springboot.backend.apirest.controllers;

import com.jponte.springboot.backend.apirest.models.entity.Order;
import com.jponte.springboot.backend.apirest.models.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class FacturaRestController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/orders/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Order show(@PathVariable Long id) {
        return clienteService.findOrderById(id);
    }
}
