package com.abbasi.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    @PostConstruct
    public void setUp(){
        this.setName("Audi8");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("Hello from the vehicle");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Vehicle is destroyed");
    }
}
