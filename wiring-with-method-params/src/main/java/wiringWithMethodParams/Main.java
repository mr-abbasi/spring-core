package wiringWithMethodParams;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wiringWithMethodParams.config.ProjectConfig;
import wiringWithMethodParams.model.Person;
import wiringWithMethodParams.model.Vehicle;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle from the context is: "+ vehicle.getName());
        var person = context.getBean(Person.class);
        System.out.println("Person from the context is :"+person);
    }
}
