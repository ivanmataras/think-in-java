package ru.ivanmataras.education.chapter7;

import static java.lang.System.out;

class Line extends Shape {

    private final int start;
    private final int end;

    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        out.println("Drawing Line: " + start + ", " + end);
    }

    @Override
    void dispose() {
        out.println("Erasing Line: " + start + ", " + end);
        super.dispose();
    }

}