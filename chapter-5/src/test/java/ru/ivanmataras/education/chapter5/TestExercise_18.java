package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_18 {

    @Test
    @Order(1)
    void testExercise_18() {
        Exercise_18 exercise_18 = new Exercise_18();
        assertNotNull(exercise_18);
        exercise_18.fillArrayOfStringsWithLoop();
        exercise_18.printArrayOfStrings();
    }

}