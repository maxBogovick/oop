package com.hillel.oop;

import java.util.Arrays;

public class ToyTester {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Toy[] arrayToys = new Toy[7];

        Shape newShape = new Shape() {
            @Override
            public String toString() {
                return null;
            }
        };

        arrayToys[0] = Toy.toyCreator(new Circle());
        arrayToys[1] = Toy.toyCreator(new Circle());
        arrayToys[2] = Toy.toyCreator(new Circle());
        arrayToys[3] = Toy.toyCreator(new Square());
        arrayToys[4] = Toy.toyCreator(new Square());
        arrayToys[5] = Toy.toyCreator(new Square());
        arrayToys[6] = Toy.toyCreator(newShape);

        for (int i = 0; i < arrayToys.length; i++) {
            if (arrayToys[i].getShape().getClass().getSimpleName().equals("Circly")) {
                System.out.println(arrayToys[i].toString());
            }
        }

        //Toy toy = Toy.toyCreator(new Circle());

    }
}
