package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Square extends Shape {

    Square() {

    }

    @Override
    void draw() {
        out.println("Call draw in Square");
    }

    @Override
    void erase() {
        out.println("Call erase in Square");
    }

}