package com.rahul.dependencyinjectiondagger2;

import android.app.Application;

public class MobileApp extends Application {

    private MobileComponent mobileComponent;
    private static MobileApp mobileApp;

    public MobileComponent getMobileComponent() {
        return mobileComponent;
    }

    public static MobileApp getMobileApp() {
        return mobileApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mobileApp = this;


        mobileComponent = DaggerMobileComponent.builder()
                .rAMModule(new RAMModule(12))
                .build();


    }
}
