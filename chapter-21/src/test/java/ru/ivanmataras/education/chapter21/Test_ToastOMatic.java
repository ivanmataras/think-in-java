package ru.ivanmataras.education.chapter21;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

class Test_ToastOMatic {

    @Test
    @Order(1)
    void testToastOMatic() throws InterruptedException {

        BlockingQueue<Toast> dryQueue = new LinkedBlockingQueue<Toast>();
        BlockingQueue<Toast> butteredQueue = new LinkedBlockingQueue<Toast>();
        BlockingQueue<Toast> finishedQueue = new LinkedBlockingQueue<Toast>();

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Toaster(dryQueue));
        executorService.execute(new Butter(dryQueue, butteredQueue));
        executorService.execute(new Jammer(butteredQueue, finishedQueue));
        executorService.execute(new Eater(finishedQueue));
        TimeUnit.SECONDS.sleep(5);
        executorService.shutdownNow();

    }

}