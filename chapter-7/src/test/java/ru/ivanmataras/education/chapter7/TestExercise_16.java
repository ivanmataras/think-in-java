package ru.ivanmataras.education.chapter7;

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
        Exercise_16_2 exercise_16_2 = new Exercise_16_2();
        assertNotNull(exercise_16_2);
        exercise_16_2.method_1();
        exercise_16_2.method_2();
        Exercise_16_1 exercise_16_1 = exercise_16_2;
        assertNotNull(exercise_16_1);
        exercise_16_1.method_1();
        exercise_16_1.method_2();
    }

}