package wiringWithMethodParams.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import wiringWithMethodParams.model.Person;
import wiringWithMethodParams.model.Vehicle;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle() {
        var vehicle = new Vehicle();
        vehicle.setName("Audi8");

        return vehicle;
    }

    @Bean
    public Person person(Vehicle vehicle) {
        var person = new Person();
        person.setName("John");
        person.setVehicle(vehicle);

        return person;
    }
}
