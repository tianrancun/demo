package com.example.demo.controller;

import com.example.demo.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello world";
    }

    @Autowired
    EmployService employService;
    private int i =0;

    @GetMapping("/getAge")
    public String getAge(){
        System.out.println(i++);
        return employService.getAge("a");
    }
}