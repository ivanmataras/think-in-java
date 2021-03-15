package ru.ivanmataras.education.chapter8;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_2 {

    @Test
    @Order(1)
    void testExercise_2() {

        RandomShapeGenerator generator = new RandomShapeGenerator();
        assertNotNull(generator);

        Shape[] shapes = new Shape[9];

        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = generator.next();
        }

        for (Shape shape : shapes) {
            shape.draw();
        }

    }

}