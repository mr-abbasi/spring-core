package com.abbasi.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component(value = "audiVehicle")
public class AudiVehicle implements Vehicle {
    private String name;

    @PostConstruct
    public void setUp(){
        this.setName("Audi");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("Hello from Audi");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Audi is destroyed");
    }
}
