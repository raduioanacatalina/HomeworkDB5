package com.raducatalinatema5.raducatalinatema5.controller;

import com.raducatalinatema5.raducatalinatema5.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("customers")
public class CustomerViewController {

    private final CustomerService customerService;

    @GetMapping
    public String getAllCustomers(Model model){
        model.addAttribute("customers", customerService.getAllCustomers());
        return "customers";
    }

    @GetMapping("{id}")
    public String getAllCustomers(Model model, @PathVariable Integer id){
        model.addAttribute("customers", customerService.getById(id));
        return "customers";
    }

    @GetMapping("/name")
    public String getByUsername(Model model, @RequestParam String username){
        model.addAttribute("customers", customerService.getByUsername(username));
        return "customers";
    }

    @GetMapping("/city")
    public String getByCity(Model model, @RequestParam String city){
        model.addAttribute("customers", customerService.getByCity(city));
        return "customers";
    }

    @GetMapping("/country")
    public String getByCountry(Model model, @RequestParam String country){
        model.addAttribute("customers", customerService.getByCountry(country));
        return "customers";
    }
}
