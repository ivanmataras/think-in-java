package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestExercise_19 {

    @Test
    @Order(1)
    public void testExercise_19() {
        Exercise_19 exercise_19 = new Exercise_19();
        assertNotNull(exercise_19);
        exercise_19.printVariableArguments(new String("argument1"), new String("argument2"));
        exercise_19.printVariableArguments(new String[]{("argument1InArray"), new String("argument2InArray")});
    }

}