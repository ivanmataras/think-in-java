package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Violin extends Stringed {

    Violin() {

    }

    void play(Note note) {
        out.println("Violin.play() ".concat(String.valueOf(note)));
    }

    String what() {
        return "Violin";
    }

    void adjust() {
        out.println("Adjusting Violin");
    }

}