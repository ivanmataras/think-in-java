package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestExercise_1 {

    @Test
    @Order(1)
     void testExercise_1() {
        Exercise_1 exercise_1 = new Exercise_1();
        assertNull(exercise_1.stringField);
    }

}