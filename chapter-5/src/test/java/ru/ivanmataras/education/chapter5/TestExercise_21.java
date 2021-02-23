package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import static java.lang.System.out;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
 class TestExercise_21 {

    @Test
    @Order(1)
     void testExercise_21() {
        for (Exercise_21 exercise_21_value : Exercise_21.values()) {
            out.println(exercise_21_value.ordinal() + " " + exercise_21_value.getSeason());
        }
    }

}