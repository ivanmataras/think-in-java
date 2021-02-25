package ru.ivanmataras.education.chapter6;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import ru.ivanmataras.education.chapter6.package1.Exercise_1;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestExercise_1 {

    @Test
    @Order(1)
    void testExercise_1() {
        Exercise_1 exercise_1 = new Exercise_1();
        assertNotNull(exercise_1);

    }

}