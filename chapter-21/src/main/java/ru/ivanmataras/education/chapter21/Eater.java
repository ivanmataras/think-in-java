package ru.ivanmataras.education.chapter21;

import java.util.concurrent.BlockingQueue;

import static java.lang.System.exit;
import static java.lang.System.out;

class Eater implements Runnable {

    private BlockingQueue<Toast> finishedQueue;

    private int count = 0;

    public Eater(BlockingQueue<Toast> finishedQueue) {
        this.finishedQueue = finishedQueue;
    }

    @Override
    public void run() {

        try {
            while (!Thread.interrupted()) {
                Toast toast = finishedQueue.take();
                if (toast.getId() != count++ || toast.getStatus() != Toast.Status.JAMMED) {
                    out.println("Error: " + toast);
                    exit(1);
                } else {
                    out.println("Chomp! " + toast);
                }
            }
        } catch (InterruptedException interruptedException) {
            out.println("Eater interrupted");
        }
        out.println("Eater off");
    }

}