package com.example.springbootcoban.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String sayHello(String name) {
        return "Hello " + name;
    }
}
