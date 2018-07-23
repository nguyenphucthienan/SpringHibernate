package com.nguyenphucthienan.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @RequestMapping("/hello-form")
    public String showForm() {
        return "hello-form";
    }

    @RequestMapping("/hello")
    public String processForm(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name.toUpperCase());
        return "hello";
    }
}
