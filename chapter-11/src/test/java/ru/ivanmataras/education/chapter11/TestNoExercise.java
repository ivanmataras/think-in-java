package ru.ivanmataras.education.chapter11;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(OrderAnnotation.class)
public class TestNoExercise {

    @Test
    @Order(1)
    public void testInitializeClasses1() {

        List<String> list = new ArrayList<String>();
        String string1 = "string1";
        String string2 = "string1";
        String string3 = "string2";
        String string4 = "string3";
        String string5 = null;

        list.add(string1);
        list.add(string2);
        list.add(string3);
        list.add(string4);
        list.add(string5);

        assertTrue(list.contains(string1));
        assertTrue(list.contains(string2));
        assertTrue(list.contains(string3));

        out.println(list);
    }

    @Test
    @Order(2)
    public void testInitializeClasses2() {
        List<TestEntity> list = new ArrayList<TestEntity>();
        TestEntity testEntity1 = new TestEntity();
        TestEntity testEntity2 = new TestEntity();
        TestEntity testEntity3 = new TestEntity();
        TestEntity testEntity4 = new TestEntity();
        TestEntity testEntity5 = null;

        list.add(testEntity1);
        list.add(testEntity2);
        list.add(testEntity3);
        list.add(testEntity4);
        list.add(testEntity5);

        assertTrue(list.contains(testEntity1));
        assertTrue(list.contains(testEntity2));
        assertTrue(list.contains(testEntity3));

        out.println(list);
    }

}