package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Exercise_10_1 {

    Exercise_10_1() {

    }

    void method_1() {
        out.println("Call method_1 from Exercise_10_1");
        method_2();
    }

    void method_2() {
        out.println("Call method_1 from Exercise_10_1");
    }

}