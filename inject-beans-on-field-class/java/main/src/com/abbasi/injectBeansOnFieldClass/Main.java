package com.abbasi.injectBeansOnFieldClass;

import com.abbasi.injectBeansOnFieldClass.config.ProjectConfig;
import com.abbasi.injectBeansOnFieldClass.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var person = context.getBean(Person.class);
        System.out.println(person.getName()+"'s vehicle is "+ person.getVehicle().getName());
    }
}
