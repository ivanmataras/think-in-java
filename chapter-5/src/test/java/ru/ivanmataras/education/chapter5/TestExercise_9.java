package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_9 {

    @Test
    @Order(1)
    void testExercise_9() {
        Exercise_9 exercise_9 = new Exercise_9();
        assertNotNull(exercise_9);
    }

}