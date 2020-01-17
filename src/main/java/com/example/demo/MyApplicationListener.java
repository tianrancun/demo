package com.example.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

//@Component
public class MyApplicationListener implements ApplicationListener<ContextRefreshedEvent> {


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("applicationName:"+contextRefreshedEvent.getApplicationContext().getApplicationName());
        System.out.println("applicationDispName:"+contextRefreshedEvent.getApplicationContext().getDisplayName());

        System.out.println("init 1.......");
    }
}
