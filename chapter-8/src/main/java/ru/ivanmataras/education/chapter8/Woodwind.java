package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Woodwind extends Wind {

    Woodwind() {

    }

    void play(Note note) {
        out.println("Woodwind.play() ".concat(String.valueOf(note)));
    }

    String what() {
        return "Woodwind";
    }

    void adjust() {
        out.println("Adjusting Woodwind");
    }

}