package com.nguyenphucthienan.springmvc.dao;

import com.nguyenphucthienan.springmvc.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> getCustomers();
    Customer getCustomer(int id);
    void saveCustomer(Customer customer);
    void deleteCustomer(int id);
}
