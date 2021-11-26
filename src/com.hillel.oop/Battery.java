package com.hillel.oop;

public abstract class Battery{
    private final String name;
    protected int capacity;
    protected int maxCapacity;
    private final Dimension dimension;

    public Battery(final int width, final int height, final String name, int capacity) {
        dimension = new Dimension(width, height);
        this.name = name;
        this.capacity = capacity;
        this.maxCapacity = capacity;
    }

    public int getWidth() {
        return dimension.getWidth();
    }

    public int getHeight() {
        return dimension.getHeight();
    }

    public String getName() {
        return name;
    }
	//comment from main branch
    public int getCapacity() {
        return capacity;
    }
	
// comment from test branch and now
    public abstract int getCharge(int value);
}
