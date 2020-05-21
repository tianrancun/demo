package com.example.demo.controller;

import com.example.demo.mapper.User;
import com.example.demo.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


//java.io.invalidclassExcepiong  class invalid for deserialization
@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello world";
    }

    @Autowired
    EmployService employService;
//    private int i =0;

    @GetMapping("/getAge/{name}")
    public User getAge(@PathVariable(name = "name") String name){
        Map<String,String> m =new HashMap<>();
//        System.out.println(i++);
        return employService.getAge(name);
    }
}
