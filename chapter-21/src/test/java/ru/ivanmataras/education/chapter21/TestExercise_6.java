package ru.ivanmataras.education.chapter21;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.lang.System.out;

class TestExercise_6 {

    @Test
    @Order(1)
    void testExercise_6() {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 6; i++) {
            executorService.execute(new Exercise_6(i, 10));
        }

        try {
            if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                executorService.shutdown();
            }
        } catch (InterruptedException interruptedException) {
            executorService.shutdown();
            interruptedException.printStackTrace();
        }

        out.println("Main thread will stop");

    }

}