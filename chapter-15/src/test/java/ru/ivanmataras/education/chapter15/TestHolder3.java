package ru.ivanmataras.education.chapter15;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class TestHolder3 {

    @Test
    @Order(1)
    void testTestHolder3() {

        Holder3<Automobile> holder3 = new Holder3<Automobile>(new Automobile());

    }

}