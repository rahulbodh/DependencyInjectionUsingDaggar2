package com.rahul.dependencyinjectiondagger2;

import android.util.Log;

import javax.inject.Inject;

public class Processor {

    String processorName;

    @Inject
    public Processor() {
        Log.d("TAGY", "Processor constructor called");

    }

    public String getProcessorName() {
        return processorName;
    }
}
