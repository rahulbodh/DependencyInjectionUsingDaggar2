package com.rahul.dependencyinjectiondagger2;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class RAMModule {

    int ramSize;

    public RAMModule(int ramSize) {
        this.ramSize = ramSize;
    }

    @Provides
    RAM provideRam() {
        Log.d("TAGY", "provideRam: " + ramSize);
        return new RAM();
    }
}
