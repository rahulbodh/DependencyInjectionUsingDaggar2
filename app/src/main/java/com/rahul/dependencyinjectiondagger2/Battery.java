package com.rahul.dependencyinjectiondagger2;

import android.util.Log;

import javax.inject.Inject;

public class Battery {

    int batteryCapacity;

    @Inject
    public Battery() {
        Log.d("TAGY", "Battery constructor called");
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
