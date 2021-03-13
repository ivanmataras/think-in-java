package ru.ivanmataras.education.chapter7;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_7 {

    @Test
    @Order(1)
    void testExercise_7() {
        Exercise_7_3 exercise_7_3 = new Exercise_7_3();
        assertNotNull(exercise_7_3);
    }

}