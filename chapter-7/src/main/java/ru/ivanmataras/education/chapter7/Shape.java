package ru.ivanmataras.education.chapter7;

import static java.lang.System.out;

class Shape {

    Shape(int i) {
        out.println("Constructor Shape");
    }

    void dispose() {
        out.println("Finished Shape");
    }
}