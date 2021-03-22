package ru.ivanmataras.education.chapter8;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_18 {

    @Test
    @Order(1)
    void testExercise_18() {
        Cycle[] cycles = {new Unicycle(), new Bicycle(), new Tricycle()};
        assertNotNull(cycles);

        cycles[0].balance();
        cycles[1].balance();
        cycles[2].balance();

        ((Unicycle) cycles[0]).balance();
        ((Bicycle) cycles[1]).balance();
        ((Tricycle) cycles[2]).balance();
    }

}