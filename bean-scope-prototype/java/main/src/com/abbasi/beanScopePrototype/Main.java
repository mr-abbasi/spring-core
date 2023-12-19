package com.abbasi.beanScopePrototype;

import com.abbasi.beanScopePrototype.config.ProjectConfig;
import com.abbasi.beanScopePrototype.model.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context  =new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicle1 = context.getBean(Vehicle.class);
        var vehicle2 = context.getBean(Vehicle.class);
        System.out.println(vehicle1.hashCode());
        System.out.println(vehicle2.hashCode());
    }
}
