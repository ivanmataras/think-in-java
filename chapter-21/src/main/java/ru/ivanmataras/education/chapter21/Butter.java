package ru.ivanmataras.education.chapter21;

import java.util.concurrent.BlockingQueue;

import static java.lang.System.out;

class Butter implements Runnable {

    private BlockingQueue<Toast> dryQueue, butteredQueue;

    public Butter(BlockingQueue<Toast> dryQueue, BlockingQueue<Toast> butteredQueue) {
        this.dryQueue = dryQueue;
        this.butteredQueue = butteredQueue;
    }

    @Override
    public void run() {

        try {
            while (!Thread.interrupted()) {
                Toast toast = dryQueue.take();
                toast.butter();
                out.println(toast);
                butteredQueue.put(toast);
            }
        } catch (InterruptedException interruptedException) {
            out.println("Butter interrupted");
        }
        out.println("Butter off");
    }

}