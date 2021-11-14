package ru.ivanmataras.education.chapter21;

import static java.lang.System.exit;
import static java.lang.System.out;

class Eater implements Runnable {

    private ToastQueue finishedQueue;

    private int count = 0;

    public Eater(ToastQueue finishedQueue) {
        this.finishedQueue = finishedQueue;
    }

    @Override
    public void run() {

        try {
            while (!Thread.interrupted()) {
                Toast toast = (Toast) finishedQueue.take();
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