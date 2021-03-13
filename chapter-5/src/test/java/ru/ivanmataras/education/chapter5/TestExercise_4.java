package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_4 {

    @Test
    @Order(1)
    void testExercise_4() {
        Exercise_4 exercise_4_1 = new Exercise_4();
        assertNotNull(exercise_4_1);
        Exercise_4 exercise_4_2 = new Exercise_4("plus message in constructor");
        assertNotNull(exercise_4_2);
    }

}