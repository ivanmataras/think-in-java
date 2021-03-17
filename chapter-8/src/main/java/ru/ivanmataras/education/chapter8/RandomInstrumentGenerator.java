package ru.ivanmataras.education.chapter8;

import java.util.Random;

class RandomInstrumentGenerator {

    private Random random = new Random(10);

    public RandomInstrumentGenerator() {

    }

    Instrument next() {

        return switch (random.nextInt(6)) {
            case 0 -> new Wind();
            case 1 -> new Percussion();
            case 2 -> new Stringed();
            case 3 -> new Brass();
            case 4 -> new Woodwind();
            case 5 -> new Violin();
            default -> throw new IllegalStateException("Unexpected value: " + random.nextInt(6));
        };
    }


}