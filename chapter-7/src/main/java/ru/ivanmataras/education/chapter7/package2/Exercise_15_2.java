package ru.ivanmataras.education.chapter7.package2;

import ru.ivanmataras.education.chapter7.package1.Exercise_15_1;

import static java.lang.System.out;

public class Exercise_15_2 extends Exercise_15_1 {

    public Exercise_15_2() {

    }

    public void method() {
        out.println("Exercise_15_1 public method");
        super.method();
    }

}