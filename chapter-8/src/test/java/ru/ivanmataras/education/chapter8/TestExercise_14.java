package ru.ivanmataras.education.chapter8;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Arrays;

import static java.lang.System.gc;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_14 {

    @Test
    @Order(1)
    void testExercise_14() {

        Shared shared = new Shared();
        assertNotNull(shared);

        Composing[] composings = {new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared)};
        assertNotNull(composings);

        for (Composing composing : composings) {
            composing.dispose();
        }

        Arrays.fill(composings, null);

        gc();
    }

}