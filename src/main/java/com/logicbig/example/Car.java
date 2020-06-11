package com.logicbig.example;

import com.fasterxml.jackson.annotation.*;

//
// When set visible true, the visible property that defines whether type identifier value will be passed
// as part of JSON stream to deserializer (true), or handled and removed by TypeDeserializer (false).
// the visible property has no effect on serialization.
//
// Default value is false, meaning that Jackson handles and removes the type identifier from JSON content
// that is passed to JsonDeserializer.
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

    public void setType(String type) {
        this.type = type;
    }
}
