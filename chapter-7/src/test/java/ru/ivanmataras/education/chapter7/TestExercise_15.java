package ru.ivanmataras.education.chapter7;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import ru.ivanmataras.education.chapter7.package1.Exercise_15_1;
import ru.ivanmataras.education.chapter7.package2.Exercise_15_2;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_15 {

    @Test
    @Order(1)
    void testExercise_15() {
        Exercise_15_1 exercise_15_1 = new Exercise_15_1();
        assertNotNull(exercise_15_1);
        //cant call method with protected access from other package
        //exercise_15_1.method();
        Exercise_15_2 exercise_15_2 = new Exercise_15_2();
        assertNotNull(exercise_15_2);
        exercise_15_2.method();
    }

}