package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
 class TestExercise_7 {

    @Test
    @Order(1)
     void testExercise_7() {
        Exercise_7 exercise_7 = new Exercise_7();
        assertNotNull(exercise_7);
    }

}