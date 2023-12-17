package com.abbasi.springBeans;

import com.abbasi.springBeans.config.ProjectConfig;
import com.abbasi.springBeans.model.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating vehicle inside of context");
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle inside of bean: "+vehicle.getName());
    }
}
