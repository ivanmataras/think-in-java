package ru.ivanmataras.education.chapter7;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_22 {

    @Test
    @Order(1)
    void testExercise_22() {
//        uncomment for compilation error
//        can't inheritance from final class
/*        Exercise_22_2 exercise_22_2 = new Exercise_22_2();
        assertNotNull(exercise_22_2);*/
    }

}