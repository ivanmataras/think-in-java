package ru.ivanmataras.education.chapter21;

import java.util.concurrent.BlockingQueue;

import static java.lang.System.out;

class Jammer implements Runnable {

    private BlockingQueue<Toast> butteredQueue, finishedQueue;

    public Jammer(BlockingQueue<Toast> butteredQueue, BlockingQueue<Toast> finishedQueue) {
        this.butteredQueue = butteredQueue;
        this.finishedQueue = finishedQueue;
    }

    @Override
    public void run() {

        try {
            while (!Thread.interrupted()) {
                Toast toast = butteredQueue.take();
                toast.jam();
                out.println(toast);
                finishedQueue.put(toast);
            }
        } catch (InterruptedException interruptedException) {
            out.println("Jammer interrupted");
        }
        out.println("Jammer off");
    }

}