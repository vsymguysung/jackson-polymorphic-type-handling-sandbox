package com.logicbig.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

//
// Polymorphic Type Handling with Car Abstract Class.
//
public class ExampleMain3 {
    public static void main(String[] args) throws IOException {
        SUV suv = new SUV();
        suv.setEngineType("6cylinder");
        suv.setZeroToSixtySecond(4);

        Truck truck = new Truck();
        truck.setHowManyWheels(6);
        truck.setMaker("Ford");

        Sedan sedan = new Sedan();
        sedan.setMaxSpeed(120);

        System.out.println("-- serializing --");
        ObjectMapper om = new ObjectMapper();
        String suvString = om.writeValueAsString(suv);
        System.out.println(suvString);
        String truckString = om.writeValueAsString(truck);
        System.out.println(truckString);
        String sedanString = om.writeValueAsString(sedan);
        System.out.println(sedanString);

        System.out.println("-- deserializing --");
        SUV suv1 = om.readValue(suvString, SUV.class);
        String suvString1 = om.writeValueAsString(suv1);
        System.out.println(suvString1);
        Truck truck1= om.readValue(truckString, Truck.class);
        String truckString1 = om.writeValueAsString(truck1);
        System.out.println(truckString1);
        Sedan sedan1 = om.readValue(sedanString, Sedan.class);
        String sedanString1 = om.writeValueAsString(sedan1);
        System.out.println(sedanString1);
    }
}
