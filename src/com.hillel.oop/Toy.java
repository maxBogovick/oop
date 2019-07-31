package com.hillel.oop;

import java.io.Serializable;

public class Toy implements Serializable, Cloneable {
    private final Shape shape;

    public Shape getShape() {
        return shape;
    }

    private Toy(Shape shape) {
        this.shape = shape;
    }

    public static Toy toyCreator(Shape shape) {
        return new Toy(shape);

    }

    @Override
    public String toString() {
        return "Toy{" +
                "shape=" + shape.toString() +
                '}';
    }
}
