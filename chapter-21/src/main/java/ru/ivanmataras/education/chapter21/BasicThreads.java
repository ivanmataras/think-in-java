package ru.ivanmataras.education.chapter21;

import static java.lang.System.out;

class BasicThreads {

    public static void main(String[] args) {
        Thread thread = new Thread(new LiftOff());
        thread.start();
        out.println("Waiting for LiftOff");
    }

}