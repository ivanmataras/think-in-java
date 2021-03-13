package ru.ivanmataras.education.chapter7;

import static java.lang.System.out;

class Exercise_20_1 {

    Exercise_20_1() {

    }

    final void method_1() {
        out.println("Call method_1 in Exercise_20_1");
    }

    private void method_2() {
        out.println("Call method_2 in Exercise_20_1");
    }

    private final void method_3() {
        out.println("Call method_3 in Exercise_20_1");
    }

    void method_4() {
        out.println("Call method_4 in Exercise_20_1");
    }

}