package ru.ivanmataras.education.chapter8;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_1 {

    @Test
    @Order(1)
    void testExercise_1() {
        Exercise_1_utility exercise_1_utility = new Exercise_1_utility();
        assertNotNull(exercise_1_utility);

        Exercise_1_1 exercise_1_1 = new Exercise_1_1();
        assertNotNull(exercise_1_1);
        exercise_1_utility.methodTestUpcasting(exercise_1_1);

        Exercise_1_2 exercise_1_2 = new Exercise_1_2();
        assertNotNull(exercise_1_1);
        exercise_1_utility.methodTestUpcasting(exercise_1_2);

        Exercise_1_3 exercise_1_3 = new Exercise_1_3();
        assertNotNull(exercise_1_3);
        exercise_1_utility.methodTestUpcasting(exercise_1_3);

    }

}