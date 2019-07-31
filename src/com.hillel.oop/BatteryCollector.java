package com.hillel.oop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BatteryCollector {

    Collection<Battery> batteries = new ArrayList<>();

    public void add(Battery battery) {
        batteries.add(battery);
    }

    public Battery getBattery(int index) {
        return ((List<Battery>)batteries).get(index);
    }
}
