package wiringMethodCall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import wiringMethodCall.model.Person;
import wiringMethodCall.model.Vehicle;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle(){
        var vehicle = new Vehicle();
        vehicle.setName("Audi8");

        return vehicle;
    }

    @Bean
    public Person person(){
        var person = new Person();
        person.setName("John");
        person.setVehicle(vehicle());

        return person;
    }

}
