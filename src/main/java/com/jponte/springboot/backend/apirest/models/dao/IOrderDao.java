package com.jponte.springboot.backend.apirest.models.dao;

import com.jponte.springboot.backend.apirest.models.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface IOrderDao extends CrudRepository<Order, Long> {
}
