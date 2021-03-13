package ru.ivanmataras.education.chapter7;

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
        Exercise_8_2 exercise_8_2_1 = new Exercise_8_2();
        assertNotNull(exercise_8_2_1);
        Exercise_8_2 exercise_8_2_2 = new Exercise_8_2(1);
        assertNotNull(exercise_8_2_2);
    }

}