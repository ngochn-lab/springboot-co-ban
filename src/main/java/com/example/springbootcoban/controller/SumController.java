package com.example.springbootcoban.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sum")
public class SumController {
    @GetMapping
    public int getSum(@RequestParam int a, @RequestParam int b){
        return a + b;
    }
}
