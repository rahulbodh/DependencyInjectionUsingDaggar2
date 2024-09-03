package com.rahul.dependencyinjectiondagger2;

import dagger.Component;

@Component(modules = {BatteryModule.class})
public interface MobileComponent {

    Mobile getMobile();
}
