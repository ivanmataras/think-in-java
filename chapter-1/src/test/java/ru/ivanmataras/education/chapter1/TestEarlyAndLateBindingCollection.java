package ru.ivanmataras.education.chapter1;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Collection;
import java.util.HashSet;

@TestMethodOrder(OrderAnnotation.class)
class TestEarlyAndLateBindingCollection {

    @Test
    @Order(1)
    void testEarlyAndLateBindingCollection() {
        Collection collection = new HashSet();
        EarlyAndLateBindingCollection.print(collection);
    }

}