package com.example.demo.violation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

//@Configurable
@Component
public class villationHandlerConfiguration {
    @Autowired
    public void servletWebTypeViolationHandler(VillationReporter villationReporter){
        System.out.println("==============");
        System.out.println(villationReporter.getClass());
    }
}
