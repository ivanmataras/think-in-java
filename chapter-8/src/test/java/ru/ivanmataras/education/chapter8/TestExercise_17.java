package ru.ivanmataras.education.chapter8;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_17 {

    @Test
    @Order(1)
    void testExercise_17() {
        StarShip starShip = new StarShip();
        assertNotNull(starShip);
        starShip.performAlert();
        starShip.change();
        starShip.performAlert();
    }

}