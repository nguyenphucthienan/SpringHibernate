package com.nguyenphucthienan.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello-form")
    public String showForm() {
        return "hello-form";
    }

    @RequestMapping("/hello")
    public String processForm() {
        return "hello";
    }
}
