package ru.ivanmataras.education.chapter21;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static java.lang.System.out;

@TestMethodOrder(OrderAnnotation.class)
class TestExercise_5 {

    @Test
    @Order(1)
    void testExercise_5() {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        List<Future<Integer>> results = new ArrayList<Future<Integer>>();

        for (int i = 0; i < 5; i++) {
            results.add(executorService.submit(new Exercise_5(i)));
        }

        for (Future<Integer> future : results) {

            try {
                out.println(future.get());
            } catch (InterruptedException interruptedException) {
                out.println(interruptedException);
            } catch (ExecutionException executionException) {
                out.println(executionException);
            } finally {
                executorService.shutdown();
            }

        }

    }

}