package ru.ivanmataras.education.chapter7;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_4 {

    @Test
    @Order(1)
    void testExercise_4() {
        Exercise_4_3 exercise_4_3 = new Exercise_4_3();
        assertNotNull(exercise_4_3);
    }

}