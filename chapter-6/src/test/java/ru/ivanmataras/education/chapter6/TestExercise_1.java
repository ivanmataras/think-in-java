package ru.ivanmataras.education.chapter6;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestExercise_1 {

    @Test
    @Order(1)
    public void testExercise_22() {
        ru.ivanmataras.education.chapter6.package1.Exercise_1 exercise_1_package_1 = new ru.ivanmataras.education.chapter6.package1.Exercise_1();
        assertNotNull(exercise_1_package_1);
        ru.ivanmataras.education.chapter6.package2.Exercise_1 exercise_1_package_2 = new ru.ivanmataras.education.chapter6.package2.Exercise_1();
        assertNotNull(exercise_1_package_2);
    }

}