package com.abbasi.config;

import com.abbasi.model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Primary
    @Bean(name = "audiVehicle")
    public Vehicle vehicle1(){
        var vehicle = new Vehicle();
        vehicle.setName("Audi8");

        return vehicle;
    }

    @Bean(value = "benzVehicle")
    public Vehicle vehicle2(){
        var vehicle = new Vehicle();
        vehicle.setName("Benz");

        return vehicle;
    }


    @Bean("ferrariVehicle")
    public Vehicle vehicle3(){
        var vehicle = new Vehicle();
        vehicle.setName("Ferrari");

        return vehicle;
    }
}
