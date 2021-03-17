package ru.ivanmataras.education.chapter8;

import static java.lang.System.out;

class Mouse extends Rodent {

    Mouse() {

    }

    @Override
    void searchForFood() {
        out.println("Mouse is searching food");
    }

    @Override
    void eat() {
        out.println("Mouse is eating food");
    }

    @Override
    void sleep() {
        out.println("Mouse is sleeping");
    }

}