package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestExercise_17 {

    @Test
    @Order(1)
    void testExercise_17() {
        Exercise_17 exercise_17 = new Exercise_17();
        assertNotNull(exercise_17);
        exercise_17.printArrayOfStrings();
    }

}