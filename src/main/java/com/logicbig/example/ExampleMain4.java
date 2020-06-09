package com.logicbig.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//
// Polymorphic Type Handling with Car1 Abstract Class.
// This test is to show how the "visible=true" works in @JsonTypeInfo annotation.
//
public class ExampleMain4 {
    public static void main(String[] args) throws IOException {
        SUV1 suv1 = new SUV1();
        suv1.setEngineType("6cylinder");
        suv1.setZeroToSixtySecond(4);

        Truck1 truck1 = new Truck1();
        truck1.setHowManyWheels(6);
        truck1.setMaker("Ford");

        Sedan1 sedan1 = new Sedan1();
        sedan1.setMaxSpeed(120);

        Dealer d = new Dealer();
        d.setCar1s(new ArrayList<>(List.of(suv1, truck1, sedan1)));


        // Test Serializing.
        System.out.println("-- serializing --");
        ObjectMapper om = new ObjectMapper();
        String dealerString = om.writeValueAsString(d);
        System.out.println(dealerString);

        // Test Deserializing.
        System.out.println("-- deserializing --");
        Dealer dealer = om.readValue(dealerString, Dealer.class);
//        System.out.println(dealer);
        String outputString = om.writeValueAsString(dealer);
        System.out.println(outputString);
    }
}
