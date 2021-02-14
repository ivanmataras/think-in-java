package ru.ivanmataras.education.chapter11;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.ArrayList;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestNoExercise {

    @Test
    @Order(1)
    public void testInitializeClasses1() {

        List<String> list = new ArrayList<String>();
        String string1 = new String("string1");
        String string2 = new String("string1");
        String string3 = new String("string2");
        String string4 = new String("string3");
        String string5 = null;
        list.add(string1);
        list.add(string2);
        list.add(string3);
        list.add(string4);
        list.add(string5);

        list.contains(string1);
        list.contains(string2);
        list.contains(string5);

        list.toString();

    }

}