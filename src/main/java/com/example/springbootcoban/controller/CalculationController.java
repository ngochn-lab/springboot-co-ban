package com.example.springbootcoban.controller;

import com.example.springbootcoban.service.CalculationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculationController {
    private final CalculationService calculationService;

    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping("/add")
    public int getAdd(@RequestParam int a, @RequestParam int b){
        return calculationService.add(a, b);
    }

    @GetMapping("/subtract")
    public int getSubtract(@RequestParam int a, @RequestParam int b){
        return calculationService.subtract(a, b);
    }

    @GetMapping("/multiply")
    public int getMultiply(@RequestParam int a, @RequestParam int b){
        return calculationService.multiply(a, b);
    }

    @GetMapping("/divide")
    public int getDivide(@RequestParam int a, @RequestParam int b){
        return calculationService.divide(a, b);
    }
}

