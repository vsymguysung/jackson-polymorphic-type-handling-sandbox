package com.logicbig.example;


import java.util.Objects;

public class Truck1 extends Car1 {
    private Integer howManyWheels;
    private String maker;

    public Truck1() {
        super("truck");
    }

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
        Truck1 truck1 = (Truck1) o;
        return Objects.equals(howManyWheels, truck1.howManyWheels) &&
                Objects.equals(maker, truck1.maker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(howManyWheels, maker);
    }

    @Override
    public String toString() {
        return "Truck1{" +
                "howManyWheels=" + howManyWheels +
                ", maker='" + maker + '\'' +
                '}';
    }
}
