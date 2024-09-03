package com.rahul.dependencyinjectiondagger2;

public class Processor {

    String processorName;

    public Processor(String processorName) {
        this.processorName = processorName;
    }

    public String getProcessorName() {
        return processorName;
    }
}
