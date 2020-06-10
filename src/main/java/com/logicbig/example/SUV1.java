package com.logicbig.example;


import java.util.Objects;

public class SUV1 extends Car1 {
    private String engineType;
    private Integer zeroToSixtySecond;

    public SUV1() {
        super("@suv");
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public Integer getZeroToSixtySecond() {
        return zeroToSixtySecond;
    }

    public void setZeroToSixtySecond(Integer zeroToSixtySecond) {
        this.zeroToSixtySecond = zeroToSixtySecond;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SUV1 suv1 = (SUV1) o;
        return Objects.equals(engineType, suv1.engineType) &&
                Objects.equals(zeroToSixtySecond, suv1.zeroToSixtySecond);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType, zeroToSixtySecond);
    }

    @Override
    public String toString() {
        return "SUV1{" +
                "engineType='" + engineType + '\'' +
                ", zeroToSixtySecond=" + zeroToSixtySecond +
                '}';
    }
}
