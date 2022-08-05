package com.raducatalinatema5.raducatalinatema5.service;

import com.raducatalinatema5.raducatalinatema5.dto.CustomerDTO;
import com.raducatalinatema5.raducatalinatema5.mapper.CustomerMapper;
import com.raducatalinatema5.raducatalinatema5.model.Customer;
import com.raducatalinatema5.raducatalinatema5.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    List<Customer> list = new ArrayList<>();

    public List<CustomerDTO> getAllCustomers() {
        return customerRepository.findAll().stream()
                .map(customerMapper::toCustomerDTO)
                .collect(Collectors.toList());
    }

    public List<CustomerDTO> getByUsername(String username){
        return customerRepository.findAll().stream()
                .filter(customer -> (Objects.equals(customer.getUsername(), username)))
                .map(customerMapper::toCustomerDTO)
                .collect(Collectors.toList());
    }

    public List<CustomerDTO> getByCity(String city)
    {
        return customerRepository.findAll().stream()
                .filter(customer -> (Objects.equals(customer.getCity(), city)))
                .map(customerMapper::toCustomerDTO)
                .collect(Collectors.toList());
    }

    public List<CustomerDTO> getByCountry(String country){
        return customerRepository.findAll().stream()
                .filter(customer -> (Objects.equals(customer.getCountry(), country)))
                .map(customerMapper::toCustomerDTO)
                .collect(Collectors.toList());
    }

    public Customer getById(Integer id) {
        return customerRepository.findById(id).get();
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteById(Integer id) {
        customerRepository.deleteById(id);
    }

    public Customer update(Integer id,Customer customer) {

        Customer aux = customerRepository.findById(id).get();
        aux.setUsername(customer.getUsername());
        aux.setCity(customer.getCity());
        aux.setCountry(customer.getCountry());
        return customerRepository.save(aux);
    }

}