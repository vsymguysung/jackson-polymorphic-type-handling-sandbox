package com.logicbig.example;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

//
// The "property" property will define the property name for the type identifiers.
//  So, "type" property will be used to keep type identifiers in the serialized JSON string.
//
// Type Identifier visibility.
// "visible = true" is for deserialization.
// "visible = true" will make the type identifier visible for deserialization via the setter, which is setType().
// so if setType() setter is defined, the type identifier will be set via that setter.
// If setType is not defined, the type identifier will have no effect and it will be ignored.
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
        property = "type", visible = false)

//
// "name" values will be used by Jackson to find a correct POJO class for deserialization.
//
@JsonSubTypes({
        @JsonSubTypes.Type(value = SUV1.class, name = "@suv"),
        @JsonSubTypes.Type(value = Truck1.class, name = "truck"),
        @JsonSubTypes.Type(value = Sedan1.class, name = "sedan")
})
public abstract class Car1 {

    // It will make getter/setter skipped for all serial/deserialization in polymorphic type handling.
//    @JsonIgnore()

    // @JsonTypeId allow the following property value to be used as a type identifier for serialization via the getter.
    @JsonTypeId
    private String type;

    protected Car1(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

//    public void setType(String type) {
//        this.type = type;
//    }
}
