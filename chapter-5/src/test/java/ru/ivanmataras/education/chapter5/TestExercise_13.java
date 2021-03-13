package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_13 {

    @Test
    @Order(1)
    void testExercise_13() {
        Exercise_13 exercise_13 = new Exercise_13();
        assertNotNull(exercise_13);
        assertNotNull(Exercise_13.stringField_1);
        assertNotNull(Exercise_13.stringField_2);
    }

}