package com.jponte.springboot.backend.apirest.models.services;

import com.jponte.springboot.backend.apirest.models.entity.Cliente;
import com.jponte.springboot.backend.apirest.models.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
    public Page<Cliente> findAll(Pageable pageable);
    public Cliente findById(Long id);
    public Cliente save(Cliente cliente);
    public void delete(Long id);
    public Order findOrderById(Long id);
    public Order saveOrder(Order order);
    public void deleteOrderById(Long id);
}
