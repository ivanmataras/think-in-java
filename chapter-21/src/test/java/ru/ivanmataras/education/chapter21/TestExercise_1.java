package ru.ivanmataras.education.chapter21;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_1 {

    @Test
    @Order(1)
    void testExercise_1() {

        Thread thread1 = new Thread(new Exercise_1());
        thread1.start();
        Thread thread2 = new Thread(new Exercise_1());
        thread2.start();
        Thread thread3 = new Thread(new Exercise_1());
        thread3.start();
        Thread thread4 = new Thread(new Exercise_1());
        thread4.start();
        Thread thread5 = new Thread(new Exercise_1());
        thread5.start();
        Thread thread6 = new Thread(new Exercise_1());
        thread6.start();

    }

}