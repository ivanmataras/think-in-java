package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_10 {

    @Test
    @Order(1)
    void testExercise_10() {
        Exercise_10 exercise_10 = new Exercise_10();
        assertNotNull(exercise_10);
    }

}