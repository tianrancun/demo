package com.example.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

//@Component
public class MyApplicationListener2 implements ApplicationListener<ContextRefreshedEvent> {


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        contextRefreshedEvent.getApplicationContext().getApplicationName();
        System.out.println("init 2.......");
    }
}
