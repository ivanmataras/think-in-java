package ru.ivanmataras.education.chapter8;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_4 {

    @Test
    @Order(1)
    void testExercise_2() {
        Instrument[] instruments = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(), new Violin()};
        assertNotNull(instruments);

        Orchestra.tuneAll(instruments);
    }

}