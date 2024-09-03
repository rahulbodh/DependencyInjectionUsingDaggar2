package com.rahul.dependencyinjectiondagger2;

import javax.inject.Inject;

public class CPU {

    Processor processor;

    @Inject
    public CPU(Processor processor) {
        this.processor = processor;
    }

    public Processor getProcessor() {
        return processor;
    }

}
