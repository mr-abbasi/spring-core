package com.abbasi.injectBeansOnSetterMethod.model;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void setUp(){
        setName("Audi8");
    }
}
