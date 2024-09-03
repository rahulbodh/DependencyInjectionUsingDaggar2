package com.rahul.dependencyinjectiondagger2;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
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

        // Displaying the creation time of the instance
        SimpleDateFormat df = new SimpleDateFormat("EEE, dd/MM/yyyy , HH:mm:ss");
        String time = df.format(Calendar.getInstance().getTime());
        DisplayTime(time);
    }

    private void DisplayTime(String time) {
        Log.d("TAGY", "Instance Created: " + time);
    }

    public void printMobileSpecs() {
        System.out.println("Processor Name: " + cpu.getProcessor().getProcessorName());
        System.out.println("Memory Card Size: " + memoryCard.getMemoryCardSize());

    }

}
