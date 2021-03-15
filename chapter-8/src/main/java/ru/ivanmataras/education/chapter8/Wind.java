package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Wind extends Instrument {

    Wind() {

    }

    void play(Note note) {
        out.println("Wind.play() ".concat(String.valueOf(note)));
    }

    String what() {
        return "Wind";
    }

    void adjust() {
        out.println("Adjusting Wind");
    }

}