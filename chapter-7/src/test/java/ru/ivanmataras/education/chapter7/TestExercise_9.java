package ru.ivanmataras.education.chapter7;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestExercise_9 {

    @Test
    @Order(1)
    void testExercise_9() {
        Exercise_9_Root exercise_9_root = new Exercise_9_Root();
        assertNotNull(exercise_9_root);
        Exercise_9_Stem exercise_9_stem = new Exercise_9_Stem();
        assertNotNull(exercise_9_stem);
    }

}