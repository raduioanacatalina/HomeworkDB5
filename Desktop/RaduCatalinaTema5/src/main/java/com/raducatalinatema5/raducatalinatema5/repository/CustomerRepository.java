package com.raducatalinatema5.raducatalinatema5.repository;

import com.raducatalinatema5.raducatalinatema5.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    List<Customer> findAll();
}
