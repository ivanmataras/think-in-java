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
        Cycle_utility cycle_utility = new Cycle_utility();
        assertNotNull(cycle_utility);

        Unicycle unicycle = new Unicycle();
        assertNotNull(unicycle);
        cycle_utility.methodTestUpcasting(unicycle);

        Bicycle bicycle = new Bicycle();
        assertNotNull(unicycle);
        cycle_utility.methodTestUpcasting(bicycle);

        Tricycle tricycle = new Tricycle();
        assertNotNull(tricycle);
        cycle_utility.methodTestUpcasting(tricycle);

    }

}