package com.rahul.dependencyinjectiondagger2;

public class Battery {

    int batteryCapacity;

    public Battery(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
