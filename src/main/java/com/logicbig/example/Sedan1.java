package com.logicbig.example;


import java.util.Objects;

public class Sedan1 extends Car1 {
    private Integer maxSpeed;

    public Sedan1() {
        super("sedan");
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sedan1 sedan1 = (Sedan1) o;
        return Objects.equals(maxSpeed, sedan1.maxSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSpeed);
    }

    @Override
    public String toString() {
        return "Sedan1{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
