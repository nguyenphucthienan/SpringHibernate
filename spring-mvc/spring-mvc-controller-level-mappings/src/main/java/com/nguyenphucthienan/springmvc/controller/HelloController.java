package com.nguyenphucthienan.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/form")
    public String showForm() {
        return "hello-form";
    }

    @RequestMapping("/process")
    public String processForm(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name.toUpperCase());
        return "hello";
    }
}
