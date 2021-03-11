package ru.ivanmataras.education.chapter7;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestExercise_10 {

    @Test
    @Order(1)
    void testExercise_10() {
        Exercise_10_Root exercise_10_root = new Exercise_10_Root("In Exercise_10_Root constructor");
        assertNotNull(exercise_10_root);
        Exercise_10_Stem exercise_10_stem = new Exercise_10_Stem("In Exercise_10_Stem constructor");
        assertNotNull(exercise_10_stem);
    }

}