package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_8 {

    @Test
    @Order(1)
    void testExercise_8() {
        Exercise_8 exercise_8 = new Exercise_8();
        assertNotNull(exercise_8);
        exercise_8.method_1();
        exercise_8.method_2();
    }

}