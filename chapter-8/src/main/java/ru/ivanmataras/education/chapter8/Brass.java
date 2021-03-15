package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Brass extends Wind {

    Brass() {

    }

    void play(Note note) {
        out.println("Brass.play() ".concat(String.valueOf(note)));
    }

    String what() {
        return "Brass";
    }

    void adjust() {
        out.println("Adjusting Brass");
    }

}