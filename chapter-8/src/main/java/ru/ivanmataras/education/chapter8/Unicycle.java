package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Unicycle extends Cycle {

    Unicycle() {

    }

    @Override
    void ride() {
        out.println("Call ride method in Unicycle");
    }

    @Override
    int wheels() {
        return 1;
    }

    @Override
    void balance() {
        out.println("Call balance method in Unicycle");
    }

}