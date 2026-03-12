package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Spring Boot demo is running successfully!";
    }

    @GetMapping("/status")
    public String status() {
        return "Application is healthy";
    }
}