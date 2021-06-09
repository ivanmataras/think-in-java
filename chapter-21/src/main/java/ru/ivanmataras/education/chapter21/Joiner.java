package ru.ivanmataras.education.chapter21;

import static java.lang.System.out;

public class Joiner extends Thread {

    private Sleeper sleeper;

    public Joiner(String name, Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }

    @Override
    public void run() {
        try {
            sleeper.join();
        } catch (InterruptedException interruptedException) {
            out.println("Interrupted");
        }
        out.println(getName() + " join completed");
    }

}