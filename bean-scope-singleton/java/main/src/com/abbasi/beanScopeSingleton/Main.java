package com.abbasi.beanScopeSingleton;

import com.abbasi.beanScopeSingleton.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context  =new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicle1 = context.getBean("benzVehicle");
        var vehicle2 = context.getBean("benzVehicle");
        System.out.println(vehicle1.hashCode());
        System.out.println(vehicle2.hashCode());

        var vehicle3 = context.getBean("audiVehicle");
        var vehicle4 = context.getBean("audiVehicle");
        System.out.println(vehicle3.hashCode());
        System.out.println(vehicle4.hashCode());


    }
}
