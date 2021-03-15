package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Stringed extends Instrument {

    Stringed() {

    }

    void play(Note note) {
        out.println("Stringed.play() ".concat(String.valueOf(note)));
    }

    String what() {
        return "Stringed";
    }

    void adjust() {
        out.println("Adjusting Stringed");
    }

}