package com.raducatalinatema5.raducatalinatema5.repository;

import com.raducatalinatema5.raducatalinatema5.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Integer> {
    List<Product> findAll();
}
