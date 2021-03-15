package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Rectangle extends Shape {

    Rectangle() {

    }

    @Override
    void draw() {
        out.println("Call draw in Rectangle");
    }

    @Override
    void erase() {
        out.println("Call erase in Rectangle");
    }

    @Override
    void printFigureName() {
        out.println("Figure name: Rectangle");
    }

}