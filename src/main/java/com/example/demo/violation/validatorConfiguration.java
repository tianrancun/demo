package com.example.demo.violation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class validatorConfiguration {
    @Bean
    public VillationReporter villationReporter(){
        System.out.println("==========validatorConfiguration");
        return  new VillationReporterImpl();
    }
}
