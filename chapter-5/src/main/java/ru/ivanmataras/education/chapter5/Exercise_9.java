package ru.ivanmataras.education.chapter5;

import static java.lang.System.out;

public class Exercise_9 {

    Exercise_9() {
        this("parameter variable");
        out.println("Exercise_9 constructor");
    }

    Exercise_9(String variable) {
        out.println("Exercise_9 constructor with string parameter" + " " + variable);
    }

}