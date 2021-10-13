package ru.ivanmataras.education.chapter21;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.lang.System.out;

class Exercise_6 implements Runnable {

    private final int id;
    private final int MAX_SLEEP_VALUE;

    Exercise_6(int id, int maxSleepValue) {
        this.id = id;
        this.MAX_SLEEP_VALUE = maxSleepValue;
    }

    @Override
    public void run() {

        out.println("Thread " + id + " prepare to sleep");

        Random random = new Random();
        int value = random.nextInt(MAX_SLEEP_VALUE + 1);
        out.println("Thread " + id + " will sleep for " + value + " seconds");

        try {
            TimeUnit.SECONDS.sleep(value);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }

        out.println("Thread " + id + " woke up");

    }

}