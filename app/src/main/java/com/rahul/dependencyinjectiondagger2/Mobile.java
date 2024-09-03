package com.rahul.dependencyinjectiondagger2;

import javax.inject.Inject;

public class Mobile {

    Battery battery;
    CPU cpu;
    MemoryCard memoryCard;

    @Inject
    public Mobile(Battery battery, CPU cpu, MemoryCard memoryCard) {
        this.battery = battery;
        this.cpu = cpu;
        this.memoryCard = memoryCard;
    }

    public void printMobileSpecs() {
        System.out.println("Battery Capacity: " + battery.getBatteryCapacity());
        System.out.println("Processor Name: " + cpu.getProcessor().getProcessorName());
        System.out.println("Memory Card Size: " + memoryCard.getMemoryCardSize());
    }

}
