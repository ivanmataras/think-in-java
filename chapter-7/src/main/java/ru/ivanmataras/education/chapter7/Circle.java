package ru.ivanmataras.education.chapter7;

import static java.lang.System.out;

class Circle extends Shape {

    Circle(int i) {
        super(i);
        out.println("Drawing Circle");
    }

    @Override
    void dispose() {
        out.println("Erasing Circle");
        super.dispose();
    }

}