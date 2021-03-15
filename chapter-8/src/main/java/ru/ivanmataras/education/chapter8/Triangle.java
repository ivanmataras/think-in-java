package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Triangle extends Shape {

    Triangle() {

    }

    @Override
    void draw() {
        out.println("Call draw in Triangle");
    }

    @Override
    void erase() {
        out.println("Call erase in Triangle");
    }

    @Override
    void printFigureName() {
        out.println("Figure name: Triangle");
    }

}