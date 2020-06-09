package com.logicbig.example;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

//
// "visible = false", both serialization/deserialization work.
//
// "visible = true", only serialization works and deserialization fails but
//  creating the getter for the type property will resolve the issue.
//
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = SUV.class, name = "suv"),
        @JsonSubTypes.Type(value = Truck.class, name = "truck"),
        @JsonSubTypes.Type(value = Sedan.class, name = "sedan")
})
public abstract class Car {
    private String type;

    public String getType() {
        return type;
    }
}
