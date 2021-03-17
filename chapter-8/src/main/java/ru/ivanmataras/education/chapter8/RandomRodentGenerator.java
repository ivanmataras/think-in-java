package ru.ivanmataras.education.chapter8;

import java.util.Random;

class RandomRodentGenerator {

    private Random random = new Random(3);

    public RandomRodentGenerator() {

    }

    Rodent next() {
        return switch (random.nextInt(3)) {
            case 0 -> new Mouse();
            case 1 -> new Hamster();
            case 2 -> new Squirrel();
            default -> throw new IllegalStateException("Unexpected value: " + random.nextInt(6));
        };
    }


}