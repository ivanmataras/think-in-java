package ru.ivanmataras.education.chapter7;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestExercise_2 {

    @Test
    @Order(1)
    void testExercise_1() {
        Exercise_2_1 exercise_2_1 = new Exercise_2_1();
        assertNotNull(exercise_2_1);
        exercise_2_1.method_1_1();
        Exercise_2_2 exercise_2_2 = new Exercise_2_2();
        assertNotNull(exercise_2_2);
        exercise_2_2.method_1_1();
        exercise_2_2.method_2_1();
    }

}