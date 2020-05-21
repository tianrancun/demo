package com.example.demo.service;

import com.example.demo.mapper.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployService {
    private int j =1;
    private ThreadLocal<Integer> k = new ThreadLocal<>();

   @Cacheable(value = "laaPrd",key="#name")
    public User getAge(String name){
       System.out.println(name);
       System.out.println(j++);
//        System.out.println(k.get());
//        k.set(j);
//        cacheService.put(j++ +"");

        return new User(name,j+"age");
    }
}
