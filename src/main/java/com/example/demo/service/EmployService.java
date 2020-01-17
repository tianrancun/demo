package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployService {
    private int j =1;
    private ThreadLocal<Integer> k = new ThreadLocal<>();

    @Autowired
    CacheService cacheService;
    public String getAge(String name){
        System.out.println(k.get());
        k.set(j);
//        cacheService.put(j++ +"");
//
//        System.out.println(cacheService.cacheMap);
        return name;
    }
}
