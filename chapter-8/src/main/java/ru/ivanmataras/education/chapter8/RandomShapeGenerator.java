package ru.ivanmataras.education.chapter8;

import java.util.Random;

class RandomShapeGenerator {

    private Random random = new Random(10);

    public RandomShapeGenerator() {

    }

    Shape next() {

        switch (random.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();

        }
    }


}