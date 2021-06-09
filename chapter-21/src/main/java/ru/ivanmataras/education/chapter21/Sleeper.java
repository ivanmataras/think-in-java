package ru.ivanmataras.education.chapter21;

import static java.lang.System.out;

public class Sleeper extends Thread {

    private int duration;

    public Sleeper(String name, int sleepTime) {
        super(name);
        duration = sleepTime;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException interruptedException) {
            out.println(getName() + " was interrupted. " + "isInterrupted(): " + isInterrupted());
            return;
        }
        out.println(getName() + " has awakened");
    }

}