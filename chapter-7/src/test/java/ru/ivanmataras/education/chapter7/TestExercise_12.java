package ru.ivanmataras.education.chapter7;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_12 {

    @Test
    @Order(1)
    void testExercise_11() {
        Exercise_12_2 exercise_12_2 = new Exercise_12_2();
        exercise_12_2.method((byte) 1);
        exercise_12_2.method((short) 1);
        exercise_12_2.method(1);
        exercise_12_2.method((long) 1);
    }

}