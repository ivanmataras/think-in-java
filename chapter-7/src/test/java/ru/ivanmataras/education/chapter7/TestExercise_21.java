package ru.ivanmataras.education.chapter7;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_21 {

    @Test
    @Order(1)
    void testExercise_21() {
        Exercise_21_2 exercise_21_2 = new Exercise_21_2();
        assertNotNull(exercise_21_2);
//         uncomment for compilation error
//         can't override private or final method in a child class
//        exercise_21_2.method_1();

    }

}