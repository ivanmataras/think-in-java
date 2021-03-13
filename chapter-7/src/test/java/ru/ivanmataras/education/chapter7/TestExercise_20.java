package ru.ivanmataras.education.chapter7;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_20 {

    @Test
    @Order(1)
    void testExercise_20() {
        Exercise_20_2 exercise_20_2 = new Exercise_20_2();
        assertNotNull(exercise_20_2);
//         uncomment for compilation error
//         cant override private or final method in a child class
/*        exercise_20_2.method_1();
        exercise_20_2.method_2();
        exercise_20_2.method_3();*/
        exercise_20_2.method_4();
    }

}