package com.nguyenphucthienan.springrest.controller;

import com.nguyenphucthienan.springrest.entity.Customer;
import com.nguyenphucthienan.springrest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> listCustomers() {
        return customerService.getCustomers();
    }
}
