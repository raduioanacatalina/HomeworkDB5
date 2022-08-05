package com.raducatalinatema5.raducatalinatema5.controller;

import com.raducatalinatema5.raducatalinatema5.dto.CustomerDTO;
import com.raducatalinatema5.raducatalinatema5.model.Customer;
import com.raducatalinatema5.raducatalinatema5.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/all")
    public List<CustomerDTO> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("{id}")
    public Customer getById(@PathVariable Integer id) {
        return customerService.getById(id);
    }

    @GetMapping("/name")
    public List<CustomerDTO> getByUsername(@RequestParam String username) {
        return customerService.getByUsername(username);
    }

    @GetMapping("/city")
    public List<CustomerDTO> getByCity(@RequestParam String city) {
        return customerService.getByCity(city);
    }

    @GetMapping("/country")
    public List<CustomerDTO> getByCountry(@RequestParam String country) {
        return customerService.getByCountry(country);
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @PutMapping("{id}")
    public Customer update(@PathVariable Integer id,@RequestBody Customer customer)
    {
        return customerService.update(id,customer);
    }
    @DeleteMapping("{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        customerService.deleteById(id);
    }
}
