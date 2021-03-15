package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Bicycle extends Cycle {

    Bicycle() {

    }

    @Override
    void ride() {
        out.println("Call ride method in Bicycle");
    }

    @Override
    int wheels() {
        return 2;
    }

}