package com.rahul.dependencyinjectiondagger2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = { IonicBatteryModule.class, RAMModule.class})
public interface MobileComponent {

    Mobile getMobile();
}
