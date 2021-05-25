package ru.ivanmataras.education.chapter21;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_4 {

    @Test
    @Order(1)
    void testExercise_3_1() {

        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            executorService.execute(new Exercise_2(i));
        }

    }

    @Test
    @Order(2)
    void testExercise_3_2() {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            executorService.execute(new Exercise_2(i));
        }

    }

    @Test
    @Order(3)
    void testExercise_3_3() {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 5; i++) {
            executorService.execute(new Exercise_2(i));
        }

    }

}