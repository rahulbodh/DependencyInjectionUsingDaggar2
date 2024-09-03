package com.rahul.dependencyinjectiondagger2;

import android.util.Log;

import javax.inject.Inject;

public class IonicBattery implements Battery {
    @Override
    public void showType() {
        Log.d("TAGY", "showType: Ionic");
    }


    @Inject
    public IonicBattery() {
    }
}
