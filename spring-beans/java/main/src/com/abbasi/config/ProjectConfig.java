package com.abbasi.config;

import com.abbasi.model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class ProjectConfig {

    @Bean
    public Vehicle vehicle(){
        var vehicle = new Vehicle();
        vehicle.setName("Benz");

        return vehicle;
    }
}
