package ru.ivanmataras.education.chapter21;

import static java.lang.System.out;

class LiftOff implements Runnable {

    private static int taskCont = 0;
    private final int id = taskCont++;
    protected int countDown = 10;

    LiftOff() {

    }

    LiftOff(int countDown) {
        this.countDown = countDown;
    }

    String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + "), ";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            out.print(status());
            Thread.yield();
        }

    }

}