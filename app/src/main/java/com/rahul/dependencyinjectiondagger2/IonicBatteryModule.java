package com.rahul.dependencyinjectiondagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class IonicBatteryModule {

    @Provides
    Battery provideIonicBattery(IonicBattery ionicBattery) {
        ionicBattery.showType();
        return ionicBattery;
    }
}
