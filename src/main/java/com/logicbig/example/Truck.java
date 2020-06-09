package com.logicbig.example;

import java.util.Objects;

public class Truck extends Car {
    private Integer howManyWheels;
    private String maker;

    public Integer getHowManyWheels() {
        return howManyWheels;
    }

    public void setHowManyWheels(Integer howManyWheels) {
        this.howManyWheels = howManyWheels;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return Objects.equals(howManyWheels, truck.howManyWheels) &&
                Objects.equals(maker, truck.maker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(howManyWheels, maker);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "howManyWheels=" + howManyWheels +
                ", maker='" + maker + '\'' +
                '}';
    }
}
