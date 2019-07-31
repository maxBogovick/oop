package com.hillel.oop;

public class Sample {
    public static int intValue = 1;

    public static void increase() {

        if (intValue < 10) {
            intValue++;
            increase();
        }
        System.out.println(" before value = " + intValue);
        //System.out.println(" after value = " + value);
    }

    public static void main(String[] args) {
        increase();
        System.out.println("result = " + intValue);
    }
}
