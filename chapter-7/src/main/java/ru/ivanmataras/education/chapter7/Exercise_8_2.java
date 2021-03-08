package ru.ivanmataras.education.chapter7;

import static java.lang.System.out;

class Exercise_8_2 extends Exercise_8_1 {

    Exercise_8_2() {
        super(0);
        out.println("In Exercise_8_2 constructor");
    }

    Exercise_8_2(int number) {
        super(number);
        out.println("In Exercise_8_2 constructor");
    }

}