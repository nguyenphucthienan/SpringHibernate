package com.nguyenphucthienan.springmvc.controller;

import com.nguyenphucthienan.springmvc.entity.Customer;
import com.nguyenphucthienan.springmvc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomers(Model model) {
        model.addAttribute("customers", customerService.getCustomers());
        return "list-customers";
    }

    @GetMapping("/add-form")
    public String showAddForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/update-form")
    public String showUpdateForm(@RequestParam("customerId") int customerId, Model model) {
        model.addAttribute("customer", customerService.getCustomer(customerId));
        return "update-form";
    }

    @PostMapping("/update")
    public String updateCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") int customerId) {
        customerService.deleteCustomer(customerId);
        return "redirect:/customer/list";
    }
}
