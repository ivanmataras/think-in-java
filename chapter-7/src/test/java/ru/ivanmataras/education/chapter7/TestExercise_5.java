package ru.ivanmataras.education.chapter7;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_5 {

    @Test
    @Order(1)
    void testExercise_5() {
        Exercise_5_3 exercise_5_3 = new Exercise_5_3();
        assertNotNull(exercise_5_3);
    }

}