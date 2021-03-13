package ru.ivanmataras.education.chapter7;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_17 {

    @Test
    @Order(1)
    void testExercise_17() {
        Exercise_17_2 exercise_17_2 = new Exercise_17_2();
        assertNotNull(exercise_17_2);
        exercise_17_2.method_1();
        exercise_17_2.method_2();
        Exercise_17_1 exercise_17_1 = exercise_17_2;
        assertNotNull(exercise_17_1);
        exercise_17_1.method_1();
        exercise_17_1.method_2();
    }

}