package com.rahul.dependencyinjectiondagger2;

import android.util.Log;

import javax.inject.Inject;

public class MemoryCard {

    int memoryCardSize;

    @Inject
    public MemoryCard() {
       Log.d("TAGY", "MemoryCard constructor called");

    }

    public int getMemoryCardSize() {
        return memoryCardSize;
    }
}
