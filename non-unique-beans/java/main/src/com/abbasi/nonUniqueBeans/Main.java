package com.abbasi.nonUniqueBeans;

import com.abbasi.nonUniqueBeans.config.ProjectConfig;
import com.abbasi.nonUniqueBeans.model.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //get bean from the name of method
        //the name of the bean is the name of the method
//        var benzVehicle = context.getBean("vehicle2",Vehicle.class);
//        var audiVehicle = context.getBean("vehicle1",Vehicle.class);
//        var ferrariVehicle = context.getBean("vehicle3",Vehicle.class);
//        System.out.println("Audi vehicle is: "+ audiVehicle.getName());
//        System.out.println("Benz vehicle is: "+ benzVehicle.getName());
//        System.out.println("Ferrari vehicle is: "+ ferrariVehicle.getName());

        //get bean from the name of bean
        //the name of the bean is the name of the method
        var audiVehicle = context.getBean("audiVehicle",Vehicle.class);
        var benzVehicle = context.getBean("benzVehicle",Vehicle.class);
        var ferrariVehicle = context.getBean("ferrariVehicle",Vehicle.class);
        System.out.println("Audi vehicle is: "+ audiVehicle.getName());
        System.out.println("Benz vehicle is: "+ benzVehicle.getName());
        System.out.println("Ferrari vehicle is: "+ ferrariVehicle.getName());

        //get bean from the name with primary annotation
        var audiVehicle1 = context.getBean(Vehicle.class);
        System.out.println("Audi vehicle from primary annotation is: "+ audiVehicle1.getName());

    }
}
