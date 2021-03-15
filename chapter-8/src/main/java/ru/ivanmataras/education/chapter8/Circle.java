package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Circle extends Shape {

    Circle() {

    }

    @Override
    void draw() {
        out.println("Call draw in Circle");
    }

    @Override
    void erase() {
        out.println("Call erase in Circle");
    }

}