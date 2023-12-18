package com.abbasi.autowireMultiBeansWithSameType.model;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("benzVehicle")
//@Primary
public class BenzVehicle implements Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void setUp(){
        setName("Benz");
    }
}
