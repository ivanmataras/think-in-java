package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static java.lang.System.gc;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestExercise_13 {

    @Test
    @Order(1)
    public void testExercise_13() {
        Exercise_13 exercise_13 = new Exercise_13();
        assertNotNull(exercise_13);
        assertNotNull(exercise_13.stringField_1);
        assertNotNull(exercise_13.stringField_2);

    }

}