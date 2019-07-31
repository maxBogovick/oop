package com.hillel.oop;

import java.util.ArrayList;

public class Accumulator extends Battery implements Dischargeable, Rechargeable {
    public Accumulator(int width, int height, String name, int capacity) {
        super(width, height, name, capacity);
    }



    @Override
    public int getCharge(int value) {
        if (value < 0) return 0;
        if (value > capacity) return 0;
        capacity = capacity - value;
        return value;
    }

    @Override
    public boolean charge(int value) {
        if (capacity > maxCapacity) return true;
        capacity = capacity + value;
        return false;
    }
}
