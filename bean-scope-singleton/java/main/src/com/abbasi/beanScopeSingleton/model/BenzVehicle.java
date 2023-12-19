package com.abbasi.beanScopeSingleton.model;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("benzVehicle")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
@Lazy
public class BenzVehicle  implements Vehicle{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void setUp(){
        System.out.println("Benz is created");
    }
}
