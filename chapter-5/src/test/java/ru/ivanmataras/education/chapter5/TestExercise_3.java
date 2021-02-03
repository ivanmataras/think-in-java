package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestExercise_3 {

    @Test
    @Order(1)
    public void testExercise_3() {
        Exercise_3 exercise_3 = new Exercise_3();
        assertNotNull(exercise_3);
    }

}