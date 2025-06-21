package com.example.servingwebcontent.pure_java_project.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
