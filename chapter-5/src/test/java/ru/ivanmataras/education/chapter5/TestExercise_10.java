package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestExercise_10 {

    @Test
    @Order(1)
    public void testExercise_10() {
        Exercise_10 exercise_10 = new Exercise_10();
        assertNotNull(exercise_10);
    }

}