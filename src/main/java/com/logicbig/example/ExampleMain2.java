package com.logicbig.example;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//
// Polymorphic Type Handling with Shape Abstract Class.
//
public class ExampleMain2 {
    public static void main(String[] args) throws IOException {
        View v = new View();
        v.setShapes(new ArrayList<>(List.of(Rectangle.of(3, 6), Circle.of(5))));

        System.out.println("-- serializing --");
        ObjectMapper om = new ObjectMapper();
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE, JsonTypeInfo.As.PROPERTY);

        String s = om.writeValueAsString(v);
        System.out.println(s);

        System.out.println("-- deserializing --");
        View view = om.readValue(s, View.class);
        System.out.println(view);
    }
}