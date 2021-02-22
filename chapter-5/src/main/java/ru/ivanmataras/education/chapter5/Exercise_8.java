package ru.ivanmataras.education.chapter5;

import static java.lang.System.out;

class Exercise_8 {

    Exercise_8() {

    }

    void method_1() {
        out.println("method_1");
        method_2();
        this.method_2();
    }

    //не возможно использовать this из статического контекста
/*    static void method_1() {
        out.println("method_1");
        method_2();
        this.method_2();
    }*/

    void method_2() {
        out.println("method_2");
    }

}