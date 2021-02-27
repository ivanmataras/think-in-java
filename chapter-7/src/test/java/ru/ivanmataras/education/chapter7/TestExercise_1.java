package ru.ivanmataras.education.chapter7;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestExercise_1 {

    @Test
    @Order(1)
    void testExercise_1() {
        Exercise_1_1 exercise_1_1 = new Exercise_1_1();
        assertNotNull(exercise_1_1);
        Exercise_1_2 exercise_1_2 = exercise_1_1.getExercise_1_2();
        assertNull(exercise_1_2);
        exercise_1_1.initializeExercise_1_2();
        exercise_1_2 = exercise_1_1.getExercise_1_2();
        assertNotNull(exercise_1_2);
    }

}