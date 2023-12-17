package com.abbasi.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
@Primary
public class BenzVehicle implements Vehicle {
    private String name;

    @PostConstruct
    public void setUp(){
        this.setName("Benz");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("Hello from Benz");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Benz is destroyed");
    }
}
