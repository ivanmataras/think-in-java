package ru.ivanmataras.education.chapter6;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import ru.ivanmataras.education.chapter6.package1.Exercise_4;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_4 {

    @Test
    @Order(1)
    void testExercise_4() {
        Exercise_4 exercise_4 = new Exercise_4();
        assertNotNull(exercise_4);
        //cant access class method from other package, because method access is protected
//        exercise_4.getStringField();
//        exercise_4.setStringField();
    }

}