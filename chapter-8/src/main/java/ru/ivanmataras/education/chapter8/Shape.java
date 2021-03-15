package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Shape {

    Shape() {

    }

    void draw() {
        out.println("Call draw in Shape");
    }

    void erase() {
        out.println("Call erase in Shape");
    }

    void printFigureName() {
        out.println("Figure name: Shape");
    }

}