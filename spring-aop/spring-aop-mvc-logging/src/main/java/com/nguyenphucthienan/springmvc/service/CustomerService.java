package com.nguyenphucthienan.springmvc.service;

import com.nguyenphucthienan.springmvc.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers();
    Customer getCustomer(int id);
    void saveCustomer(Customer customer);
    void deleteCustomer(int id);
}
