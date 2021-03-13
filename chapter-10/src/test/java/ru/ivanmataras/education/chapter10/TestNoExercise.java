package ru.ivanmataras.education.chapter10;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
public class TestNoExercise {

    @Test
    @Order(1)
    public void testInitializeClasses1() {
        Outer outer = new Outer();
        Outer.Inner inner1 = outer.new Inner();
        Outer.Inner inner2 = outer.new Inner();
        assertNotNull(inner1);
        assertNotNull(inner2);
    }

}