package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_16 {

    @Test
    @Order(1)
    void testExercise_16() {
        Exercise_16 exercise_16 = new Exercise_16();
        assertNotNull(exercise_16);
        exercise_16.fillArrayOfStringsWithLoop();
        exercise_16.printArrayOfStrings();
    }

}