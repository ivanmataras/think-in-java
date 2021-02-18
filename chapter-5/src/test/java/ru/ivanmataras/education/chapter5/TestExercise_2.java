package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestExercise_2 {

    @Test
    @Order(1)
    public void testExercise_2() {
        Exercise_2 exercise_2 = new Exercise_2();
        assertNotNull(exercise_2);
        assertNotNull(exercise_2.stringField_1);
        assertNotNull(exercise_2.stringField_2);
    }

}