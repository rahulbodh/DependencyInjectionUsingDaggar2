package com.rahul.dependencyinjectiondagger2;

import dagger.Component;

@Component(modules = { IonicBatteryModule.class, RAMModule.class})
public interface MobileComponent {

    Mobile getMobile();
}
