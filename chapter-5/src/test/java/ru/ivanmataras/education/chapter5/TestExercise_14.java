package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_14 {

    @Test
    @Order(1)
    void testExercise_12() {
        Exercise_14 exercise_14 = new Exercise_14();
        assertNotNull(exercise_14);
        assertNotNull(Exercise_14.stringField_1);
        assertNotNull(Exercise_14.stringField_2);
    }

}