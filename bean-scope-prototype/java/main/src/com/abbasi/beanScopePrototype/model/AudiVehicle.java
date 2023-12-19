package com.abbasi.beanScopePrototype.model;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("audiVehicle")
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
@Lazy
public class AudiVehicle implements Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void setUp() {
        setName("Audi");
        System.out.println("Audi is created with the hashcode: " + hashCode());
    }
}
