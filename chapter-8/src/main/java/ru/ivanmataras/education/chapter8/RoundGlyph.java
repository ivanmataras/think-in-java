package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class RoundGlyph extends Glyph {

    private int radius = 1;

    RoundGlyph(int radius) {
        this.radius = radius;
        out.println("RoundGlyph.RoundGlyph(), radius = ".concat(String.valueOf(radius)));
    }

    @Override
    void draw() {
        out.println("RoundGlyph().draw(), radius = ".concat(String.valueOf(radius)));
    }

}