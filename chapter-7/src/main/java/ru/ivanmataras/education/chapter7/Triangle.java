package ru.ivanmataras.education.chapter7;

import static java.lang.System.out;

class Triangle extends Shape {

    Triangle(int i) {
        super(i);
        out.println("Drawing Triangle");
    }

    @Override
    void dispose() {
        out.println("Erasing Triangle");
        super.dispose();
    }

}