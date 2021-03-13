package ru.ivanmataras.education.chapter7;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_19 {

    @Test
    @Order(1)
    void testExercise_19() {
        Exercise_19 exercise_19_1 = new Exercise_19("1");
        assertNotNull(exercise_19_1);
        assertEquals("1", exercise_19_1.finalStringField);

        Exercise_19 exercise_19_2 = new Exercise_19("2");
        assertNotNull(exercise_19_2);
        assertEquals("2", exercise_19_2.finalStringField);
    }

}