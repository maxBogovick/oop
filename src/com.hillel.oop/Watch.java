package com.hillel.oop;

public class Watch extends Parent{

    private final String name;
    private final Dimension dimension;
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public Watch(int width, int height, String name) {
        System.out.println("init Watch constructor");
        dimension = new Dimension(width, height);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void run() {
        second++;
        if (second == 59) {
            minute++;
            second = 0;
        }
        if (minute == 59) {
            hour++;
            minute = 0;
        }
    }

    public String getTime() {
        return "Time is hour = " + hour + " minute = " + minute + " second = " + second;
    }
}
