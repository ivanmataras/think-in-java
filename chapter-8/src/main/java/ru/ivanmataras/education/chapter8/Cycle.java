package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Cycle {

    Cycle() {

    }

    void ride() {
        out.println("Call ride method in Cycle");
    }

    void ride(Cycle cycle) {
        cycle.ride();
        out.println("Wheels number : ".concat(String.valueOf(cycle.wheels())));
    }

    int wheels() {
        return 0;
    }

    void balance() {
        out.println("Call balance method in Cycle");
    }

}