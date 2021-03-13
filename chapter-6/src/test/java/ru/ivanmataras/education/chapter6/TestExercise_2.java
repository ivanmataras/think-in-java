package ru.ivanmataras.education.chapter6;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_2 {

    @Test
    @Order(1)
    void testExercise_2() {
        // compilation will fail without full names
        ru.ivanmataras.education.chapter6.package1.Exercise_2 exercise_2_package_1 = new ru.ivanmataras.education.chapter6.package1.Exercise_2();
        assertNotNull(exercise_2_package_1);
        ru.ivanmataras.education.chapter6.package2.Exercise_2 exercise_2_package_2 = new ru.ivanmataras.education.chapter6.package2.Exercise_2();
        assertNotNull(exercise_2_package_2);
    }

}