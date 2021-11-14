package ru.ivanmataras.education.chapter21;

import static java.lang.System.out;

class Butter implements Runnable {

    private ToastQueue dryQueue, butteredQueue;

    public Butter(ToastQueue dryQueue, ToastQueue butteredQueue) {
        this.dryQueue = dryQueue;
        this.butteredQueue = butteredQueue;
    }

    @Override
    public void run() {

        try {
            while (!Thread.interrupted()) {
                Toast toast = (Toast) dryQueue.take();
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