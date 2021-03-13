package ru.ivanmataras.education.chapter6;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class TestInitialize1 {

    @Test
    @Order(1)
    void testInitializeClasses1() {

    }

}
