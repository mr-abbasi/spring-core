package com.abbasi;

import com.abbasi.model.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating vehicle out of the spring context");
        var vehicle = new Vehicle();
        vehicle.setName("Audi8");
        System.out.println("Vehicle object out of the context: "+vehicle.getName());
    }
}
