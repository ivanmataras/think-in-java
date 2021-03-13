package ru.ivanmataras.education.chapter7;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_18 {

    @Test
    @Order(1)
    void testExercise_18() {
        Exercise_18 exercise_18_1 = new Exercise_18(1, "1");
        assertNotNull(exercise_18_1);

        assertEquals(10, exercise_18_1.STATIC_FINAL_INT_FIELD);
        assertEquals("STATIC_FINAL_STRING_FIELD", exercise_18_1.STATIC_FINAL_STRING_FIELD);

        assertEquals(1, exercise_18_1.intFinalField);
        assertEquals("1", exercise_18_1.finalStringField);

        Exercise_18 exercise_18_2 = new Exercise_18(2, "2");
        assertNotNull(exercise_18_2);

        assertEquals(10, exercise_18_2.STATIC_FINAL_INT_FIELD);
        assertEquals("STATIC_FINAL_STRING_FIELD", exercise_18_2.STATIC_FINAL_STRING_FIELD);

        assertEquals(2, exercise_18_2.intFinalField);
        assertEquals("2", exercise_18_2.finalStringField);
    }

}