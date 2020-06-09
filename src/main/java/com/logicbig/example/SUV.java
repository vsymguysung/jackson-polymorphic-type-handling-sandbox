package com.logicbig.example;

import java.util.Objects;

public class SUV extends Car {
    private String engineType;
    private Integer zeroToSixtySecond;

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
        SUV that = (SUV) o;
        return Objects.equals(engineType, that.engineType) &&
                Objects.equals(zeroToSixtySecond, that.zeroToSixtySecond);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType, zeroToSixtySecond);
    }

    @Override
    public String toString() {
        return "SportUtilityVehicle{" +
                "engineType='" + engineType + '\'' +
                ", zeroToSixtySecond=" + zeroToSixtySecond +
                '}';
    }
}
