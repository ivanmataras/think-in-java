package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static java.lang.System.gc;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
 class TestExercise_11 {

    @Test
    @Order(1)
     void testExercise_11() {
        Exercise_11 exercise_11 = new Exercise_11();
        assertNotNull(exercise_11);
        exercise_11 = null;
        assertNull(exercise_11);
        gc();
    }

}