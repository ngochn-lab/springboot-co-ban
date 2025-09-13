package com.example.springbootcoban.config;

import com.example.springbootcoban.service.CalculationService;
import com.example.springbootcoban.service.TimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    TimeService timeService(){
        return new TimeService();
    }

    @Bean
    CalculationService calculationService(){
        return new CalculationService();
    }
}
