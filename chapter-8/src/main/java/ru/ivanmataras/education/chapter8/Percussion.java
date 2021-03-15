package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Percussion extends Instrument {

    Percussion() {

    }

    void play(Note note) {
        out.println("Percussion.play() ".concat(String.valueOf(note)));
    }

    String what() {
        return "Percussion";
    }

    void adjust() {
        out.println("Adjusting Percussion");
    }

}