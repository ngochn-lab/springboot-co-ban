package com.example.springbootcoban.controller;

import com.example.springbootcoban.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {
    @Autowired
    GreetingService greetingService;

    @GetMapping
    public String getGreeting(@RequestParam String name) {
        return greetingService.sayHello(name);
    }
}
