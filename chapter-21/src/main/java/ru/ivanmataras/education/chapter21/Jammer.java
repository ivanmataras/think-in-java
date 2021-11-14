package ru.ivanmataras.education.chapter21;

import static java.lang.System.out;

class Jammer implements Runnable {

    private ToastQueue butteredQueue, finishedQueue;

    public Jammer(ToastQueue butteredQueue, ToastQueue finishedQueue) {
        this.butteredQueue = butteredQueue;
        this.finishedQueue = finishedQueue;
    }

    @Override
    public void run() {

        try {
            while (!Thread.interrupted()) {
                Toast toast = (Toast) butteredQueue.take();
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