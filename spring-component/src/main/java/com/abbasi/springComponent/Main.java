package com.abbasi.springComponent;

import com.abbasi.springComponent.config.ProjectConfig;
import com.abbasi.springComponent.model.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating Vehicle with Component stereotype");
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicle = context.getBean("benzVehicle",Vehicle.class);
        System.out.println("Vehicle bean is created with Component Stereotype: "+vehicle.getName());
        vehicle.printHello();
        context.close();
    }
}