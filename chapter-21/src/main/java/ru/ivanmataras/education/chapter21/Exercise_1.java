package ru.ivanmataras.education.chapter21;

import static java.lang.System.out;

class Exercise_1 implements Runnable {

    Exercise_1() {
        out.println("In Exercise_1 constructor");
    }

    @Override
    public void run() {

        out.println("Exercise_1 in the beginning of run method");

        for (int i = 0; i < 3; i++) {
            out.println("Element : " + i);
            Thread.yield();
        }

        out.println("Exercise_1 in the end of run method");

    }

}