package ru.ivanmataras.education.chapter7;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestExercise_3 {

    @Test
    @Order(1)
    void testExercise_3() {
        Exercise_3_3 exercise_3_3 = new Exercise_3_3();
        assertNotNull(exercise_3_3);
    }

}