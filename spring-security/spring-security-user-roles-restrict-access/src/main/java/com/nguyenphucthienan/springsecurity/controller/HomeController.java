package com.nguyenphucthienan.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("/admin-page")
    public String getAdminPage() {
        return "admin";
    }

    @GetMapping("/manager-page")
    public String getManagerPage() {
        return "manager";
    }
}
