package ru.ivanmataras.education.chapter8;

import java.util.Random;

class RandomShapeGenerator {

    private Random random = new Random(10);

    public RandomShapeGenerator() {

    }

    Shape next() {

        return switch (random.nextInt(4)) {
            case 0 -> new Circle();
            case 1 -> new Square();
            case 2 -> new Triangle();
            case 3 -> new Rectangle();
            default -> throw new IllegalStateException("Unexpected value: " + random.nextInt(4));
        };
    }


}