package ru.ivanmataras.education.chapter21;

import static java.lang.System.out;

class MoreBasicThreads {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
        out.println("Waiting for LiftOff");
    }

}