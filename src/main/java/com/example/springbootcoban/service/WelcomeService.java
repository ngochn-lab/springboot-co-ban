package com.example.springbootcoban.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
    public String getWelcomeMessage(String username, String lang){
        if (lang.equals("en")){
            return "Welcome, " + username;
        } else if (lang.equals("vi")){
            return "Xin chào, " + username;
        } else {
            return "No other languages are supported beside English and Vietnamese\nKhông hỗ trợ ngôn ngữ khác ngoài tiếng Anh và tiếng Việt!";
        }
    }
}
