package com.rahul.dependencyinjectiondagger2;

import javax.inject.Inject;

public class Mobile {

    Battery battery;
    CPU cpu;
    MemoryCard memoryCard;
    RAM ram;

    // Now battery is an interface
    // we can't pass battery interface , we need to pass a child
    @Inject
    public Mobile(Battery battery, CPU cpu, MemoryCard memoryCard , RAM ram) {
        this.battery = battery;
        this.cpu = cpu;
        this.memoryCard = memoryCard;
        this.ram = ram;
    }

    public void printMobileSpecs() {
        System.out.println("Processor Name: " + cpu.getProcessor().getProcessorName());
        System.out.println("Memory Card Size: " + memoryCard.getMemoryCardSize());
       
    }

}
