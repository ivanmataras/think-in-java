package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class RectangularGlyph extends Glyph {

    private int radius = 1;

    RectangularGlyph(int radius) {
        this.radius = radius;
        out.println("RectangularGlyph.RectangularGlyph(), radius = ".concat(String.valueOf(radius)));
    }

    @Override
    void draw() {
        out.println("RectangularGlyph().draw(), radius = ".concat(String.valueOf(radius)));
    }

}