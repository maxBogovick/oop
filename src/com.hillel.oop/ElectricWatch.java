package com.hillel.oop;

import java.util.Objects;

public class ElectricWatch extends Watch {

    private Battery battery;

    public ElectricWatch(int width, int height, String name) {
        super(width, height, name);
        System.out.println("init electric constructor");
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void run() {
        if (Objects.isNull(battery)) return;
        while (battery.getCharge(1) > 0) {
            super.run();
        }
    }
}
