package ru.ivanmataras.education.chapter8;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_16 {

    @Test
    @Order(1)
    void testExercise_16() {
        RoundGlyph roundGlyph = new RoundGlyph(5);
        assertNotNull(roundGlyph);
        RectangularGlyph rectangularGlyph = new RectangularGlyph(5);
        assertNotNull(rectangularGlyph);
    }

}