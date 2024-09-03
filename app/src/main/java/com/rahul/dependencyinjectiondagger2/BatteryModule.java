package com.rahul.dependencyinjectiondagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class BatteryModule {

    @Provides
    Battery provideBattery() {
        return new Battery();
    }
}
