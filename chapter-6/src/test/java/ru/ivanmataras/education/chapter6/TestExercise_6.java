package ru.ivanmataras.education.chapter6;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_6 {

    @Test
    @Order(1)
    void testExercise_6() {
        Exercise_6 exercise_6 = new Exercise_6();
        assertNotNull(exercise_6);
        String exercise_6_1_StringField = exercise_6.getExercise_6_1_StringField();
        assertNull(exercise_6_1_StringField);
        exercise_6.setExercise_6_1_StringField("exercise_6_1_StringField");
    }

}