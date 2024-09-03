package com.rahul.dependencyinjectiondagger2;

public class CPU {

    Processor processor;

    public CPU(Processor processor) {
        this.processor = processor;
    }

    public Processor getProcessor() {
        return processor;
    }

}
