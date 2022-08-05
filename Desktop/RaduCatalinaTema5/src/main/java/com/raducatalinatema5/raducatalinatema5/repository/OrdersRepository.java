package com.raducatalinatema5.raducatalinatema5.repository;

import com.raducatalinatema5.raducatalinatema5.model.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepository extends CrudRepository<Orders, Integer> {
    List<Orders> findAll();
}
