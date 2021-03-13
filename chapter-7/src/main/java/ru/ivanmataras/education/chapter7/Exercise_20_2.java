package ru.ivanmataras.education.chapter7;

import static java.lang.System.out;

class Exercise_20_2 extends Exercise_20_1 {

    Exercise_20_2() {

    }

    // uncomment for compilation error
    // cant override private or final method in a child class

/*    @Override
    final void method_1() {
        out.println("Call method_1 in Exercise_20_2");
    }

    @Override
    private void method_2() {
        out.println("Call method_2 in Exercise_20_2");
    }

    @Override
    private final void method_3() {
        out.println("Call method_3 in Exercise_20_2");
    }

    @Override
    void method_3() {
        out.println("Call method_3 in Exercise_20_2");
    }*/

    @Override
    void method_4() {
        out.println("Call method_4 in Exercise_20_2");
    }

}