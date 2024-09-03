package com.rahul.dependencyinjectiondagger2;

import dagger.Component;

@Component(modules = { IonicBatteryModule.class})
public interface MobileComponent {

    Mobile getMobile();
}
