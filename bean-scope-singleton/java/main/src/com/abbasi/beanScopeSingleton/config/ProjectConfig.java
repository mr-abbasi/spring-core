package com.abbasi.beanScopeSingleton.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.abbasi.beanScopeSingleton.model"})
public class ProjectConfig {

//    @Bean("audiVehicle")
//    public Vehicle audiVehicle(){
//        var vehicle = new AudiVehicle();
//        vehicle.setName("Audi");
//
//        return vehicle;
//    }
//
//    @Bean("benzVehicle")
//    public Vehicle benzVehicle(){
//        var vehicle = new AudiVehicle();
//        vehicle.setName("Benz");
//
//        return vehicle;
//    }
}
