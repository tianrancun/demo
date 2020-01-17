package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CacheService {
    public Map<String,String> cacheMap = new HashMap();

    public void put(String v){
        cacheMap.put(v,v);
    }
}
