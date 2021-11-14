package ru.ivanmataras.education.chapter21;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.lang.System.out;

class Toaster implements Runnable {

    private ToastQueue toastQueue;

    private int count = 0;

    private Random random = new Random(47);

    public Toaster(ToastQueue toastQueue) {
        this.toastQueue = toastQueue;
    }

    @Override
    public void run() {

        try {
            while (!Thread.interrupted()) {
                TimeUnit.MILLISECONDS.sleep(100 + random.nextInt(500));
                Toast toast = new Toast(count++);
                out.println(toast);
                toastQueue.put(toast);
            }
        } catch (InterruptedException interruptedException) {
            out.println("Toaster interrupted");
        }
        out.println("Toaster off");
    }

}