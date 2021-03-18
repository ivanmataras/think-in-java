package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Glyph {

    Glyph() {
        out.println("Glyph.Glyph() before call draw()");
        draw();
        out.println("Glyph.Glyph() after call draw()");
    }

    void draw() {
        out.println("Glyph.draw()");
    }

}