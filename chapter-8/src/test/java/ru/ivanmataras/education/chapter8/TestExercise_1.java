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
        Cycle cycle = new Cycle();
        assertNotNull(cycle);

        Cycle unicycle = new Unicycle();
        assertNotNull(unicycle);
        cycle.ride(unicycle);

        Bicycle bicycle = new Bicycle();
        assertNotNull(unicycle);
        cycle.ride(bicycle);

        Tricycle tricycle = new Tricycle();
        assertNotNull(tricycle);
        cycle.ride(tricycle);

    }

}