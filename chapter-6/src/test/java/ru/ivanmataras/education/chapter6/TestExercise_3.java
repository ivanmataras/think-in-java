package ru.ivanmataras.education.chapter6;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_3 {

    @Test
    @Order(1)
    void testExercise_2() {
        ru.ivanmataras.education.chapter6.package1.Exercise_3 exercise_3_package_1 = new ru.ivanmataras.education.chapter6.package1.Exercise_3();
        assertNotNull(exercise_3_package_1);
        exercise_3_package_1.debug();
        ru.ivanmataras.education.chapter6.package2.Exercise_3 exercise_3_package_2 = new ru.ivanmataras.education.chapter6.package2.Exercise_3();
        assertNotNull(exercise_3_package_2);
        exercise_3_package_2.debug();
    }

}