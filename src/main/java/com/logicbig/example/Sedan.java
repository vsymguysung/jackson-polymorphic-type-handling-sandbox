package com.logicbig.example;

import java.util.Objects;

public class Sedan extends Car {
    private Integer maxSpeed;

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
        Sedan sedan = (Sedan) o;
        return Objects.equals(maxSpeed, sedan.maxSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSpeed);
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
