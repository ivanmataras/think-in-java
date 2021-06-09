package ru.ivanmataras.education.chapter21;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class TestThreadJoining {

    @Test
    @Order(1)
    void testThreadJoining() {

        Sleeper sleepy = new Sleeper("Sleepy", 1);
        Sleeper grumpy = new Sleeper("Grumpy", 1);

        Joiner dopey = new Joiner("Dopey", sleepy);
        Joiner doc = new Joiner("Doc", grumpy);

        grumpy.interrupt();

    }

}