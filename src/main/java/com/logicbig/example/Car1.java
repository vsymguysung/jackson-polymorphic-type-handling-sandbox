package com.logicbig.example;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = SUV1.class, name = "suv"),
        @JsonSubTypes.Type(value = Truck1.class, name = "truck"),
        @JsonSubTypes.Type(value = Sedan1.class, name = "sedan")
})
public abstract class Car1 {
    @JsonIgnore() // Help to remove the duplicated "type" property.
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
