package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Unicycle extends Cycle {

    Unicycle() {

    }

    @Override
    void ride() {
        out.println("Call ride method in Unicycle");
    }

}