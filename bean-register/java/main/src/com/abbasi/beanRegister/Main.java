package com.abbasi.beanRegister;

import com.abbasi.beanRegister.config.ProjectConfig;
import com.abbasi.beanRegister.model.AudiVehicle;
import com.abbasi.beanRegister.model.BenzVehicle;
import com.abbasi.beanRegister.model.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var randomNumber = new Random().nextInt(1000);

        Supplier<Vehicle> benzSupplier = () -> {
          var benzVehicle = new BenzVehicle();
          benzVehicle.setName("Benz");
          return benzVehicle;
        };
        Supplier<Vehicle> audiSupplier = () -> {
            var audiVehicle = new AudiVehicle();
            audiVehicle.setName("Audi");
            return audiVehicle;
        };

        if (randomNumber % 2 == 0) {
            context.registerBean("benzVehicle",Vehicle.class,benzSupplier);
        } else {
            context.registerBean("benzVehicle", Vehicle.class,audiSupplier);
        }

        var vehicle = context.getBean(Vehicle.class);
        System.out.println("Random number is: "+ randomNumber);
        System.out.println("Vehicle registered in the context is: "+vehicle.getName());
    }
}
