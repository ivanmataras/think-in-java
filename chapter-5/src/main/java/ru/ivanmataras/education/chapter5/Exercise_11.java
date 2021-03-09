package ru.ivanmataras.education.chapter5;

import static java.lang.System.out;

class Exercise_11 {

    Exercise_11() {

    }

    @Override
    public void finalize() {
        out.println("In finalize method");
    }

}