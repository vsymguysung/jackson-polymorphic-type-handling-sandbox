package com.logicbig.example;

import java.util.List;

public class Dealer {
    private List<Car1> car1s;

    public List<Car1> getCar1s() {
        return car1s;
    }

    public void setCar1s(List<Car1> car1s) {
        this.car1s = car1s;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "car1s=" + car1s +
                '}';
    }
}
