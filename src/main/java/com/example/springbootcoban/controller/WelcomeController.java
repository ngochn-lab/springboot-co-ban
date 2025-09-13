package com.example.springbootcoban.controller;

import com.example.springbootcoban.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
    @Autowired
    private WelcomeService welcomeService;

    @GetMapping("/{username}")
    public String getWelcome(@PathVariable String username, @RequestParam String lang) {
        return welcomeService.getWelcomeMessage(username, lang);
    }
}
