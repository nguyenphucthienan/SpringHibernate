package com.nguyenphucthienan.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @RequestMapping("/hello-form")
    public String showForm() {
        return "hello-form";
    }

    @RequestMapping("/hello")
    public String processForm(HttpServletRequest request, Model model) {
        String name = request.getParameter("name").toUpperCase();
        model.addAttribute("name", name);
        return "hello";
    }
}
