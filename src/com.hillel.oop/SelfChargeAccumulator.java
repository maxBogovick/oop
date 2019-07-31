package com.hillel.oop;

public class SelfChargeAccumulator extends Accumulator implements SelfRechargeable {

    private Charger charger;

    public SelfChargeAccumulator(int width, int height, String name, int capacity) {
        super(width, height, name, capacity);
        charger = new Charger();
    }

    @Override
    public void switchOn() {
        charger.doCharge(this);
    }
}
