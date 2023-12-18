package com.abbasi.autowireMultiBeansWithSameType.model;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    private final Vehicle vehicle;

    public Person(@Qualifier("audiVehicle") Vehicle benzVehicle) {
        this.vehicle = benzVehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    @PostConstruct
    public void setUp(){
        setName("John");
    }
}
