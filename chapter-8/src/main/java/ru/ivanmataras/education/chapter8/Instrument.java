package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Instrument {

    Instrument() {

    }

    void play(Note note) {
        out.println("Instrument.play() ".concat(String.valueOf(note)));
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        out.println("Adjusting Instrument");
    }

}