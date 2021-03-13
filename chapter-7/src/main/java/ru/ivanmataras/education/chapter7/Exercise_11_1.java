package ru.ivanmataras.education.chapter7;

import static java.lang.System.out;

class Exercise_11_1 {

    Exercise_11_2 exercise_11_2 = new Exercise_11_2();

    Exercise_11_1() {

    }

    void method() {
        out.println("Call method() in Exercise_11_1");
        exercise_11_2.method();
    }

}