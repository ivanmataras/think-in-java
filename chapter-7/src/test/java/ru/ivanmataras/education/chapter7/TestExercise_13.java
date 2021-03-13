package ru.ivanmataras.education.chapter7;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_13 {

    @Test
    @Order(1)
    void testExercise_11() {
        Exercise_13_2 exercise_13_2 = new Exercise_13_2();
        exercise_13_2.method((byte) 1);
        exercise_13_2.method((short) 1);
        exercise_13_2.method(1);
        exercise_13_2.method((long) 1);
    }

}