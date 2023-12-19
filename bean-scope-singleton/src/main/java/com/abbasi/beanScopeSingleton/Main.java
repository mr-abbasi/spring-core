package com.abbasi.beanScopeSingleton;

import com.abbasi.beanScopeSingleton.config.ProjectConfig;
import com.abbasi.beanScopeSingleton.model.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle1 = (Vehicle) context.getBean("benzVehicle");
        Vehicle vehicle2 = (Vehicle) context.getBean("benzVehicle");
        System.out.println(vehicle1.hashCode() + " " + vehicle1.getName());
        System.out.println(vehicle2.hashCode() + " " + vehicle1.getName());

        var vehicle3 = context.getBean("audiVehicle");
        var vehicle4 = context.getBean("audiVehicle");
        System.out.println(vehicle3.hashCode() + " " + vehicle1.getName());
        System.out.println(vehicle4.hashCode() + " " + vehicle1.getName());


    }
}
