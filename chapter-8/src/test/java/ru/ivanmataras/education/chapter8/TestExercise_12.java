package ru.ivanmataras.education.chapter8;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_12 {

    @Test
    @Order(1)
    void testExercise_12() {

        RandomRodentGenerator randomRodentGenerator = new RandomRodentGenerator();
        assertNotNull(randomRodentGenerator);

        Rodent[] rodents = new Rodent[9];

        for (int i = 0; i < rodents.length; i++) {
            rodents[i] = randomRodentGenerator.next();
        }

        for (Rodent rodent : rodents) {
            rodent.searchForFood();
            rodent.eat();
            rodent.sleep();
        }

    }

}