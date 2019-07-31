package com.hillel.oop;

public class Charger {

    public void doCharge(Rechargeable battery) {
        for (int i = 0; i < ((Battery)battery).maxCapacity; i++) {
            battery.charge(i);
        }
    }
}
