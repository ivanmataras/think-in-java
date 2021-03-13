package ru.ivanmataras.education.chapter7;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_11 {

    @Test
    @Order(1)
    void testExercise_11() {
        Exercise_11_1 exercise_11_1 = new Exercise_11_1();
        assertNotNull(exercise_11_1);
        exercise_11_1.method();

    }

}