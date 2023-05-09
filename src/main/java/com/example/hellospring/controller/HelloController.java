package com.example.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("hell-mvc")
    public String helloMVC(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-templete";

    }
}
