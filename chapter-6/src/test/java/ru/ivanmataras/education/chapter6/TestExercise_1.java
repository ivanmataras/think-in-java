package ru.ivanmataras.education.chapter6;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import ru.ivanmataras.education.chapter6.package1.Exercise_1;

import static java.lang.System.out;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestExercise_1 {

    @Test
    @Order(1)
    public void testExercise_22() {
        Exercise_1 exercise1 = new Exercise_1();
        assertNotNull(exercise1);

    }

}