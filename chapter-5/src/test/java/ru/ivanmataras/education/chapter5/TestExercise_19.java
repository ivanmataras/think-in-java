package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_19 {

    @Test
    @Order(1)
    void testExercise_19() {
        Exercise_19 exercise_19 = new Exercise_19();
        assertNotNull(exercise_19);
        exercise_19.printVariableArguments("argument1", "argument2");
        exercise_19.printVariableArguments(new String[]{"argument1InArray", "argument2InArray"});
    }

}