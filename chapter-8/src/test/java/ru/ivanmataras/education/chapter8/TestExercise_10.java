package ru.ivanmataras.education.chapter8;

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
        Exercise_10_2 exercise_10_2 = new Exercise_10_2();
        assertNotNull(exercise_10_2);
        Exercise_10_1 exercise_10_1 = exercise_10_2;
        exercise_10_1.method_1();
    }

}