package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Tricycle extends Cycle {

    Tricycle() {

    }

    @Override
    void ride() {
        out.println("Call ride method in Tricycle");
    }

}